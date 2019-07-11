package com.stackroute.domain;

public class Actor {
    private String actorName,gender;
    int age;
    public Actor(String actorName,String gender,int age)
    {
        this.actorName=actorName;
        this.gender=gender;
        this.age=age;
    }
   public void displayActorInfo()
   {
       System.out.println("Actor name :" +actorName+ " Gender:" +gender+ " Age:" +age);
   }


}
