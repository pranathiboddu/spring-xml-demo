package com.stackroute;


import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml") ;
        /*BeanLifecycleDemoBean beanLifecycleDemoBean=applicationContext.getBean("beanlifecycle",BeanLifecycleDemoBean.class);
        //beanLifecycleDemoBean.afterPropertiesSet();
        //beanLifecycleDemoBean.destroy();
        beanLifecycleDemoBean.customInit();
        beanLifecycleDemoBean.customDestroy();*/
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=applicationContext.getBean("beanlifecycle",BeanPostProcessorDemoBean.class);
        beanPostProcessorDemoBean.destroyBean();
        beanPostProcessorDemoBean.initBean();
        ///beanPostProcessorDemoBean.postProcessAfterInitialization();
        //beanPostProcessorDemoBean.postProcessBeforeInitialization();

    }
}


