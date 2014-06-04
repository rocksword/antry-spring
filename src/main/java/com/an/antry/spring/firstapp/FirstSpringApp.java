package com.an.antry.spring.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class FirstSpringApp {

    public static void main(String[] args) {
        // ApplicationContext ctx = new
        // AnnotationConfigApplicationContext(FirstSpringApp.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-firstspringapp.xml");
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
