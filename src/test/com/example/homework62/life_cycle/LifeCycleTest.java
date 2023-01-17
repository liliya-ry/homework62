package com.example.homework62.life_cycle;

import static org.junit.jupiter.api.Assertions.*;

import com.example.homework62.life_cycle.A;
import com.example.homework62.life_cycle.B;
import com.example.homework62.life_cycle.Config;
import org.junit.jupiter.api.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class LifeCycleTest {
    ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    void postConstruct() {
        A a = context.getBean(A.class);
        assertNotNull(a);
        assertEquals("post construct", a.message);
    }

    @Test
    void preDestroy() {
        B b = context.getBean(B.class);
        assertNotNull(b);
        assertEquals("pre destroy", b.message);
    }
}
