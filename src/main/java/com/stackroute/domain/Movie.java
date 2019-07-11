package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie
{
    public Movie(Actor actor)
    {
        this.actor=actor;
    }
    public Movie()
    {

    }
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }



public void display()
{
    actor.displayActorInfo();
}


}
