package com.example.homework62.life_cycle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class LifeCycleTest {
    @Test
    void postConstruct() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        A a = context.getBean(A.class);
        assertNotNull(a);
        assertEquals("post construct", a.message);
    }

    @Test
    void preDestroy() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        B b = context.getBean(B.class);
        assertNotNull(b);
        assertEquals("pre destroy", b.message);
    }

    @Test
    @DisplayName("Test InitializingBean interface using xml config")
    void initializingBean1() {
        var context = new ClassPathXmlApplicationContext("context.xml");
        CustomInitializingBean bean = context.getBean(CustomInitializingBean.class);
        assertNotNull(bean);
        assertEquals("Hello", bean.message);
    }

    @Test
    @DisplayName("Test InitializingBean interface using java config")
    void initializingBean2() {
        var context = new AnnotationConfigApplicationContext(Config.class);
        CustomInitializingBean bean = context.getBean(CustomInitializingBean.class);
        assertNotNull(bean);
        assertEquals("Hello", bean.message);
    }

    @Test
    @DisplayName("Test DisposableBean interface using xml config")
    void disposableBean1() {
        var context = new ClassPathXmlApplicationContext("context.xml");
        CustomDisposableBean bean = context.getBean(CustomDisposableBean.class);
        assertNotNull(bean);
        assertNull(bean.message);
        context.close();
        assertEquals("destroyed", bean.message);
    }

    @Test
    @DisplayName("Test DisposableBean interface using java config")
    void disposableBean2() {
        var context = new AnnotationConfigApplicationContext(Config.class);
        CustomDisposableBean bean = context.getBean(CustomDisposableBean.class);
        assertNotNull(bean);
        assertNull(bean.message);
        context.close();
        assertEquals("destroyed", bean.message);
    }
}
