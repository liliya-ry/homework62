package com.example.homework62.bean_post_processor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BeanPostProcessorTest {
    @Test
    @DisplayName("Test BeanPostProcessor using xml config")
    void test1() {
        var context = new ClassPathXmlApplicationContext("bean-context.xml");
        A a = context.getBean(A.class);
        assertNotNull(a);
        assertEquals("Hello world", a.message);
        context.close();
        assertEquals("Hello world!", a.message);
    }

    @Test
    @DisplayName("Test BeanPostProcessor using java config")
    void test2() {
        var context = new AnnotationConfigApplicationContext(Config.class, CustomBeanProcessor.class);
        B b = context.getBean(B.class);
        assertNotNull(b);
        assertEquals("Hello world", b.message);
        context.close();
        assertEquals("Hello world!", b.message);
    }
}
