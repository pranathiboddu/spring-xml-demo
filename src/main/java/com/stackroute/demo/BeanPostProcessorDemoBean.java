package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor //implemented beanpost processor
{

    public void initBean()  //initialized init
    {
        System.out.println("Init Bean");
    }
    
    public void destroyBean() //initialized destroy method
    {
        System.out.println("Destroy bean");
    }

}
