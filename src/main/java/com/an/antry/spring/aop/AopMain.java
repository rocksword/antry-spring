package com.an.antry.spring.aop;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
        CustomerService cs = (CustomerService) ctx.getBean("customerService");
        cs.printName();
        cs.printURL();
        try {
            cs.printThrowException();
        } catch (Exception e) {
        }

        Set<String> abc = new HashSet<>();
        abc.add("a");
        abc.add(null);
        System.out.println(abc);
    }
}
