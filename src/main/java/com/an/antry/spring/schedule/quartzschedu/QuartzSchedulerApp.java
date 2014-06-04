package com.an.antry.spring.schedule.quartzschedu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuartzSchedulerApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-quartzSchedu.xml");
        return;
    }
}
