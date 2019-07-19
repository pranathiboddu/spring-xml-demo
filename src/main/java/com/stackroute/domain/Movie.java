package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie
{
    public Movie(Actor actor) //initialed parameterized constructor
    {
        this.actor=actor;
    }
    public Movie()
    {

    }
    Actor actor;
    public void setActor(Actor actor) //implemented setter for actor
    {
        this.actor = actor;
    }



public void display() //calling actor class method
{
    actor.displayActorInfo();
}


}
