package com.example.homework62.life_cycle;

import org.springframework.context.annotation.*;

@ComponentScan("life_cycle")
@Configuration
public class Config {
    @Bean
    public A a() {
        return new A();
    }

    @Bean
    public B b() {
        return new B();
    }

    @Bean
    public CustomInitializingBean exampleInitBean() {
        return new CustomInitializingBean();
    }

    @Bean
    public CustomDisposableBean exampleDestroyBean() {
        return new CustomDisposableBean();
    }
}
