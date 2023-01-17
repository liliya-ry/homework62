package com.example.homework62.bean_post_processor;

import org.springframework.stereotype.Component;

@Component
public class A {
    String message;

    public void initBean() {
        System.out.println("A is Initialized.");
        message += " ";
    }

    public void destroyBean() {
        System.out.println("A is Destroyed.");
        message += "!";
    }
}
