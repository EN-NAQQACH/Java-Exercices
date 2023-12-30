package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beanfactory.xml");
    HelloWorldImp helloWorld = (HelloWorldImp) context.getBean("helloworld");
    helloWorld.execute();
    }
    

}