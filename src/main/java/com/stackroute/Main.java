package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class Main {
    public static void main(String[] args)
    {
        //using application context
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml" );
        Movie movie1=applicationContext.getBean("movie",Movie.class);
        movie1.display();

        //using bean factory
        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(new FileSystemResource("/home/pranathi/spring-xml-demo/src/main/resources/beans.xml"));
        Movie movie2=xmlBeanFactory.getBean("movie",Movie.class);
        movie2.display();

        //using beandefinitionregistry and beandefinitionreader
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie movie3 =((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie",Movie.class);
        movie3.display();
     }
    }

