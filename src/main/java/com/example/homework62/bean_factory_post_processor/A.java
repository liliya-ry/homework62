package com.example.homework62.bean_factory_post_processor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Value("${message}")
    String message;
}
