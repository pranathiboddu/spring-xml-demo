package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean , DisposableBean //initialized initializingbean and disposable bean
{

    public void afterPropertiesSet() throws Exception
    {
        //System.out.println("Initializing bean");
    }


    public void destroy() throws Exception
    {
        //System.out.println("disposable bean");
    }

    public void customInit() //initialized custom init
    {
        System.out.println("Method customInit() invoked...");
    }

    public void customDestroy() //initialized custom destroy
    {
        System.out.println("Method customDestroy() invoked...");
    }
}

