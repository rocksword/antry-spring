package com.an.antry.spring.schedule.taskexecute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class TaskExecuteApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-taskexecute.xml");

        ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) ctx.getBean("taskExecutor");

        System.out.println("[x] - now threadpool active threads totalNum : " + taskExecutor.getActiveCount());
        TaskExecutorExample taskExecutorExample = (TaskExecutorExample) ctx.getBean("taskExecutorExample");
        taskExecutorExample.printMessages();
        System.out.println("[x] - now threadpool active threads totalNum : " + taskExecutor.getActiveCount());

        int i = 2;
        while (i > 0) {
            System.out.println(System.currentTimeMillis());
            Thread.sleep(1000 * 10);
            i--;
        }
        System.out.println("Exit");
        return;
    }
}
