package com.an.antry.spring.schedule.taskexecute;

import org.springframework.core.task.TaskExecutor;

public class TaskExecutorExample {

    private TaskExecutor taskExecutor;

    public TaskExecutorExample(TaskExecutor taskExecutor) {
        System.out.println("TaskExecutorExample: " + taskExecutor.toString());
        this.taskExecutor = taskExecutor;
    }

    public void printMessages() {
        for (int i = 0; i < 10; i++) {
            taskExecutor.execute(new MessagePrinterTask("Message" + i));
        }
    }
}
