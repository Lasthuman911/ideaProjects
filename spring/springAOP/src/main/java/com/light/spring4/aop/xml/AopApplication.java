package com.light.spring4.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于xml配置的aop测试类
 */
public class AopApplication {
    public static void main(String[] args) {
        ApplicationContext cx = new ClassPathXmlApplicationContext("aop.xml");
        Person person = (Person) cx.getBean("personImpl");
        person.eat();
        person.write();
    }
}
