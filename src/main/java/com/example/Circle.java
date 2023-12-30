package com.example;

public class Circle implements Shape {
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculatearea() {
        return Math.PI * radius * radius;
    }
    
}
