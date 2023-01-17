package test.com.example.homework62.scope;

import static org.junit.jupiter.api.Assertions.*;

import com.example.homework62.scope.A;
import com.example.homework62.scope.B;
import com.example.homework62.scope.C;
import com.example.homework62.scope.Config;
import org.junit.jupiter.api.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ScopeTest {
    ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    @Test
    void singletonScope() {
        A a1 = context.getBean(A.class);
        A a2 = context.getBean(A.class);
        assertEquals(a1, a2);
    }

    @Test
    void prototypeScope() {
        B b1 = context.getBean(B.class);
        B b2 = context.getBean(B.class);
        assertNotEquals(b1, b2);
    }

    @Test
    void defaultScope() {
        C c1 = context.getBean(C.class);
        C c2 = context.getBean(C.class);
        assertEquals(c1, c2);
    }
}
