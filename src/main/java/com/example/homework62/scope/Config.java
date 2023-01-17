package com.example.homework62.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@ComponentScan("scope")
@Configuration
public class Config {
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public A a() {
        return new A();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public B b() {
        return new B();
    }

    @Bean
    public C c() {
        return new C();
    }
}
