package com.stackroute.domain;

public class Actor {
    private String actorName,gender; //initialzed literals for actor class
    int age;
    public void setActorName(String actorName) //done setter injection
    {
        this.actorName = actorName;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
   public void displayActorInfo()
   {
       System.out.println("Actor name :" +actorName+ " Gender:" +gender+ " Age:" +age);
   }


}
