package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware//implemented applicationcontextaware
{
    //implemented methods for interface
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println(applicationContext);
    }

    public Movie(Actor actor)
    {
        this.actor=actor;
    }
    public Movie()
    {

    }
    Actor actor;
    public void setActor(Actor actor) 
    {
        this.actor = actor;
    }



public void display() //calling actor class method
{
    actor.displayActorInfo();
}


}
