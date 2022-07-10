/**
 * @Description
 * @Author everforcc
 * @Date 2022-06-27 16:00
 * Copyright
 */

package cn.cc.busiservice.config.token;

import cn.cc.user.dto.CustomUser;
import com.alibaba.fastjson.JSONObject;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * 简易工具类
 */
@Slf4j
public class UserTokenJSON implements IUserToken {

    @SneakyThrows
    @Override
    public String userToString(CustomUser customUser) {
        return customUser.toString();
    }

    /**
     * token转用户,正式开发要校验严谨一点
     * 1. md5摘要对比
     * 2. jwt
     * 3. 缓存也要校验
     *
     * @param str 字符串
     * @return 用户
     */
    @SneakyThrows
    @Override
    public CustomUser stringToUser(String str) {
        try{
            CustomUser customUser = JSONObject.parseObject(str, CustomUser.class);
            log.info("token转用户成功: {}", customUser.toString());
            return customUser;
        }catch (Exception e){
            log.error("token转用户失败: {}", str, e);
            return null;
        }
    }
}
