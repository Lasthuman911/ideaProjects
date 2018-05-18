package com.light.spring4.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 使用FunctionService实例
 *
 * @author lszhen
 * @date 2018/5/10.
 */
@Service
public class UseFunctionService {
    @Autowired
    private FunctionService functionService;

    public String sayHello(String name) {
        return functionService.sayHello(name);
    }
}
