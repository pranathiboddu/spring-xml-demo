package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor {

    private String actorName,gender; //initialzed literals for actor class

   /* public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    int age;

   public Actor(String actorName,String gender,int age) //initialed parameterized constructor
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
