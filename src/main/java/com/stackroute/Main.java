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

        Movie movie=applicationContext.getBean("movie",Movie.class);
        movie.display();

        Movie movie1=applicationContext.getBean("movie1",Movie.class);
        movie1.display();

        Movie movie2=applicationContext.getBean("movie2",Movie.class);
        movie2.display();




     }
    }

