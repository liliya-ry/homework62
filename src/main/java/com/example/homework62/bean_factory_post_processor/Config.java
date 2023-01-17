package com.example.homework62.bean_factory_post_processor;

import org.springframework.context.annotation.*;

@ComponentScan("bean_post_processor")
@Configuration
@PropertySource("classpath:prop.properties")
public class Config {
    @Bean
    public A a() {
        return new A();
    }
}
