package com.example.homework62.life_cycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class CustomInitializingBean implements InitializingBean {
    String message;

    @Override
    public void afterPropertiesSet() {
        message = "Hello";
    }
}
