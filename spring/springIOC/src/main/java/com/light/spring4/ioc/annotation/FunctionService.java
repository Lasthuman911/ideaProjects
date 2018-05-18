package com.light.spring4.ioc.annotation;


import org.springframework.stereotype.Service;

/**
 * wzm:@Service 一般用于Service层
 *
 * @author lszhen
 * @date 2018/5/10.
 */
@Service
public class FunctionService {
    public String sayHello(String name) {
        return "Hello,Welcome " + name;
    }
}
