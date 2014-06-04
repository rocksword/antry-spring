package com.an.antry.spring.schedule.quartz;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class MyJob {
    public void work() {
        System.out.println("MyJob date:" + new Date().toString());
    }
}
