package com.example.homework62.bean_post_processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("bean_post_processor")
@Configuration
public class Config {
    @Bean
    public B b() {
        return new B();
    }
}
