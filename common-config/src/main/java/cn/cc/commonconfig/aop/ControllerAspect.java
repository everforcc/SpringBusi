/**
 * @Description
 * @Author everforcc
 * @Date 2022-07-07 21:49
 * Copyright
 */

package cn.cc.commonconfig.aop;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;

/**
 * controller 切面
 * 公共的controller日志
 */
@Component
@Aspect
@Slf4j
public class ControllerAspect {

    // 所有controller拦截输出日志
    @Pointcut("execution(* cn.cc..*.controller..*.*(..))")
    public void point() {

    }

    @Before(value = "point()")
    public void before(JoinPoint joinPoint) {
        String str = Arrays.toString(joinPoint.getArgs());
        log.info("controller 前置日志 : 【{}】", str);
    }

    @AfterReturning(value = "point()", returning = "result")
    public void after(JoinPoint joinPoint, Object result) {
        String res = Objects.isNull(result) ? "" : JSON.toJSONString(result);
        log.info("controller 后置日志 : 【{}】", res);
    }

}
