/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 09:15
 * Copyright
 */

package cn.cc.busiservice.config.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * user模块的mvc配置
 * 所有请求都会经过
 */
@Configuration
public class MVCUserConfig implements WebMvcConfigurer {

    /**
     * 登录校验,权限拦截
     * @param registry 注册器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                // 需要登录的路径
                .addPathPatterns("/**")
                // 放开登录
                .excludePathPatterns("/login/**")
                // 放开open
                .excludePathPatterns("/open/**");
    }

}
