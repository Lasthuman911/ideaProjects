package com.light.spring4.ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 *
 * @author lszhen
 * @date 2018/5/10.
 */
public class IocApplication {
    public static void main(String[] args) {
        //TODO spring的容器类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(IocConfig.class);
        UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);
        String result = useFunctionService.sayHello("lszhen");
        System.out.println(result);
        ctx.close();
    }
}
