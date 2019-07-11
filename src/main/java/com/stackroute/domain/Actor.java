package com.stackroute.domain;

public class Actor {
    private String actorName,gender;
    int age;
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setGender(String gender) {
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
