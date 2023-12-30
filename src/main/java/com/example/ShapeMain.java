package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("Shapes.xml");
            Shape circle = (Shape) context.getBean("circle");
            System.out.println("circle area : "+ circle.calculatearea());

            Shape square = (Shape) context.getBean("Square");
            System.out.println("square area : "+ square.calculatearea());

    }
}
