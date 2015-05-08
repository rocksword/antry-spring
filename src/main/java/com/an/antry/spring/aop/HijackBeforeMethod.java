package com.an.antry.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object returnVal) throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked!");
    }
}
