package com.example.homework62.life_cycle;

import org.springframework.beans.factory.DisposableBean;

public class CustomDisposableBean implements DisposableBean {
    String  message;

    @Override
    public void destroy() throws Exception {
        message = "destroyed";
    }
}
