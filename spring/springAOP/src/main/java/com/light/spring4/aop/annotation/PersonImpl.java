package com.light.spring4.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class PersonImpl implements Person {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void write() {
        System.out.println("print");
    }
}
