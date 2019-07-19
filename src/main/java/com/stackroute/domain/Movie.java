package com.stackroute.domain;

public class Movie 
{
    public Movie() //implemented default constructor
    {

    }
    Actor actor;
    public void setActor(Actor actor) 
    {
        this.actor = actor;
    }
public void display() //calling actor method
{
    actor.displayActorInfo();
}


}
