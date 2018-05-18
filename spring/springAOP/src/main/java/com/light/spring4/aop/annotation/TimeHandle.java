package com.light.spring4.aop.annotation;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 定义横切关注点，即和各业务无关的通用的逻辑
 */
//@Aspect
@Component
@Order(value = 2)
public class TimeHandle {
    /**
     * TODO 这里使用Around出现了信息丢失的情况，函数本身的输出都不见了，启动此项则把Aspect注释去除
     */
    @Around("execution(* com.light.spring4.aop.annotation.Person.*(..))")
    public void printCurrentTime() {
        System.out.println("currentTime = " + System.currentTimeMillis() + " nanoTime = " + System.nanoTime());
    }
}
