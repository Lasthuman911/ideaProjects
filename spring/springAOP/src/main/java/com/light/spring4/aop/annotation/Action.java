package com.light.spring4.aop.annotation;

import java.lang.annotation.*;

/**
 * 定义一个注解
 *
 * @author lszhen
 * @date 2018/5/10.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
