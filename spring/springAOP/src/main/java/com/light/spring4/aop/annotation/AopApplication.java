package com.light.spring4.aop.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于java配置的aop测试类
 */
public class AopApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cx = new AnnotationConfigApplicationContext(AopConfig.class);
        Person person = (Person) cx.getBean("personImpl");
        cx.getBean(DemoAnnotationService.class).add();
        person.eat();
        person.write();
        cx.close();
    }
}
