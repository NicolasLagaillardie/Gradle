package com.devmind.gradle;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyApplicationTest {

    MyApplication application = new MyApplication();


    @Test
    public void shouldSayHello(){
        assertEquals("I want to learn Gradle", application.getMessage());
    }

}