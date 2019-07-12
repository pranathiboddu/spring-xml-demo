package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

    public void initBean() {
        System.out.println("Init Bean");
    }
    
    public void destroyBean() {
        System.out.println("Destroy bean");
    }

}
