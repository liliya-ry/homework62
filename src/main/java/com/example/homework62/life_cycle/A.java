package com.example.homework62.life_cycle;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class A {
    String message;

    @PostConstruct
    public void initBean() {
        message = "post construct";
    }
}

