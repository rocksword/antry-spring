package com.an.antry.spring.firstapp;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {

    public String getMessage() {
        return "Hello, my first Spring application!";
    }
}
