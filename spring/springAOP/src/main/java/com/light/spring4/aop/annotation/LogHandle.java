package com.light.spring4.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 定义切面
 */
@Aspect
@Component
@Order(value = 1)
public class LogHandle {

    /**
     * 定义切点
     */
    @Pointcut("@annotation(com.light.spring4.aop.annotation.Action)")
    public void annotationPointCut() {
    }

    /**
     * 拦截注解
     *
     * @param joinPoint
     */
    @After("annotationPointCut()")
    public void afterAnnotation(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getDeclaredAnnotation(Action.class);
        System.out.println("在" + method.getName().toString() + "方法执行后执行注解式拦截 " + action.name());
    }

    /**
     * 拦截方法
     */
    @Before("execution(* com.light.spring4.aop.annotation.Person.*(..))")
    public void logBefore() {
        System.out.println("log before");
    }

    @After("execution(* com.light.spring4.aop.annotation.Person.*(..))")
    public void logAfter() {
        System.out.println("log after");
    }
}
