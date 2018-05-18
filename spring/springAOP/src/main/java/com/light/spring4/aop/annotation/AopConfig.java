package com.light.spring4.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 * wzm：@EnableAspectJAutoProxy 开启spring对AspectJ代理的支持
 * @author lszhen
 * @date 2018/5/10.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopConfig {
}
