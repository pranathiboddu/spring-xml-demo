package com.stackroute.domain;

public class Movie
{
    Actor actor; //created actor class object
    public Movie(Actor actor)
    {
    this.actor=actor;
    }
public void display() //calling actor class method
{
    actor.displayActorInfo();
}


}
