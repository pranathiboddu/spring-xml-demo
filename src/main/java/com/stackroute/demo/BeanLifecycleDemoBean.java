package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean , DisposableBean
{

    public void afterPropertiesSet() throws Exception
    {
        //System.out.println("Initializing bean");
    }


    public void destroy() throws Exception
    {
        //System.out.println("disposable bean");
    }

    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }

    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked...");
    }
}

