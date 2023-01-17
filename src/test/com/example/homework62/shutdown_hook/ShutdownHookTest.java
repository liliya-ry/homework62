package test.com.example.homework62.shutdown_hook;

import com.example.homework62.shutdown_hook.Boot;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ShutdownHookTest {
    @Test
    void test1() throws Exception {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean-context.xml");
        Boot.runApp(ctx);
    }
}
