package com.example.homework62.bean_post_processor;

import jakarta.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class B {
    String message;

    @PostConstruct
    public void initBean() {
        System.out.println("B is Initialized.");
        message += " ";
    }

    @PreDestroy
    public void destroyBean() {
        System.out.println("B is Destroyed.");
        message += "!";
    }
}
