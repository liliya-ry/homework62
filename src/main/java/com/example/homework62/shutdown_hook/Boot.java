package com.example.homework62.shutdown_hook;

import com.example.homework62.bean_post_processor.A;
import org.springframework.context.ConfigurableApplicationContext;

public class Boot {
    public static void runApp(ConfigurableApplicationContext ctx) {
        ctx.registerShutdownHook();
        System.out.println("App running");
        A a = ctx.getBean(A.class);
    }
}
