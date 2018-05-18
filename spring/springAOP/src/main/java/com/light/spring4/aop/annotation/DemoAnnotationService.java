package com.light.spring4.aop.annotation;

import org.springframework.stereotype.Service;

/**
 * @author lszhen
 * @date 2018/5/10.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解拦截的add方法")
    public void add(){
        System.out.println("执行add方法");
    }
}
