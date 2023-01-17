package com.example.homework62.life_cycle;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class B {
    String message;

    @PostConstruct
    public void destroyBean() {
        message = "pre destroy";
    }
}
