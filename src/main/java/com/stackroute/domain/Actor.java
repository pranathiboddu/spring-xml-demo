package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;

public class Actor implements BeanNameAware, BeanFactoryAware //implemented beanaware and beanfactory aware
{

    private String actorName,gender;

   public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;

   public Actor(String actorName,String gender,int age)
    {
        this.actorName=actorName;
        this.gender=gender;
        this.age=age;
    }
    public void setBeanName(String s)
    {
        System.out.println("BeanNameAware " +s);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException //implemented methods for interfaces
    {
        System.out.println("In BeanFactoryAware " +beanFactory);
    }
   public void displayActorInfo()
   {
       System.out.println("Actor name :" +actorName+ " Gender:" +gender+ " Age:" +age);
   }


}
