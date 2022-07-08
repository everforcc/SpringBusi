package cn.cc.appuser.config;

import cn.cc.appuser.token.IToken;
import cn.cc.appuser.token.TokenJSON;
import cn.cc.commonutils.annotation.Authorization;
import cn.cc.commonutils.constant.HttpHeadersConstant;
import cn.cc.user.dto.CustomUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Objects;

@Slf4j
public class LoginHandlerInterceptor implements HandlerInterceptor {

    // 处理token
    IToken iToken = new TokenJSON();

    /**
     * 对进来的数据进行拦截校验,取出token校验缓存是否存在权限
     *
     * @param request  请求
     * @param response 响应
     * @param handler  处理器
     * @return 返回结果
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 登录成功后，保存用户session
        String token = request.getHeader(HttpHeadersConstant.AUTH_TOKEN);
        CustomUser customUser = iToken.stringToUser(token);
        if (Objects.isNull(customUser)) {
            iToken.response(response, "用户信息异常");
            return false;
        }

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Authorization authorization = handlerMethod.getMethodAnnotation(Authorization.class);
            // 此处接口必须有权限,分为管理员和普通用户,

            if (authorization != null) {
                String[] auths = authorization.value();
                HashSet<String> funcSet = customUser.getFuncSet();
                boolean flag = false;
                for (String auth : auths) {
                    // 只要任何一个包含权限就返回
                    if (funcSet.contains(auth)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    iToken.response(response, "没有权限");
                }
            }
        }

        // 设置用户信息在,controller可以拿到
        request.setAttribute("customUser", customUser);
        return true;
    }
}
