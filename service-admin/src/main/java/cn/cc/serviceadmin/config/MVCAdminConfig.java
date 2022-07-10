/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 09:15
 * Copyright
 */

package cn.cc.serviceadmin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * admin模块的mvc配置
 * 所有请求都会经过
 */
@Configuration
public class MVCAdminConfig implements WebMvcConfigurer {

    /**
     * 登录校验,权限拦截
     * @param registry 注册器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

}
