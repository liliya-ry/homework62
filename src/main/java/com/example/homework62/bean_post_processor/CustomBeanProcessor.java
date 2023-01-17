package com.example.homework62.bean_post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization() - " + bean.getClass().getSimpleName());
        if (bean instanceof A) {
            ((A)bean).message = "Hello";
        } else if (bean instanceof B) {
            ((B)bean).message = "Hello";
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization() - " + bean.getClass().getSimpleName());
        if (bean instanceof A) {
            ((A)bean).message += "world";
        } else if (bean instanceof B) {
            ((B)bean).message += "world";
        }
        return bean;
    }
}
