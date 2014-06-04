package com.an.antry.spring.schedule.quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class QuartzApp {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-quartz.xml");

        MyJob myJob = ctx.getBean(MyJob.class);
        myJob.work();
        int i = 10;
        while (i > 0) {
            System.out.println(System.currentTimeMillis());
            Thread.sleep(1000 * 10);
            i--;
        }
        return;
    }
}
