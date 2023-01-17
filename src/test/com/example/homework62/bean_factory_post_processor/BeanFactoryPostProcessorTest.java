package com.example.homework62.bean_factory_post_processor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class BeanFactoryPostProcessorTest {
    @Test
    @DisplayName("Test BeanPostProcessor using java config")
    void test1() {
        var context = new AnnotationConfigApplicationContext(Config.class, CustomBeanFactoryPostProcessor.class);
        A a = context.getBean(A.class);
        assertNotNull(a);
        assertEquals("Hi", a.message);
    }
}
