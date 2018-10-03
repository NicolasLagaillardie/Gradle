package com.devmind.gradle;



public class MyApplication {

    public static void main (String[] args){
        MyApplication application = new MyApplication();
        System.out.println(application.getMessage());
    }

    public String getMessage(){
        return "I want to learn Gradle";
    }
}
