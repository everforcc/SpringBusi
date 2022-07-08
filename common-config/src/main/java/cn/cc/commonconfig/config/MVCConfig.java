/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-08 09:15
 * Copyright
 */

package cn.cc.commonconfig.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 所有请求都会经过
 */
//@Configuration
public class MVCConfig implements WebMvcConfigurer {

    @Resource
    private ObjectMapper objectMapper;

    /**
     * dto枚举字段 不匹配映射为null
     */
    @PostConstruct
    public void myObjectMapper() {
        // 解决enum不匹配问题 默认值为false
        objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
    }

}
