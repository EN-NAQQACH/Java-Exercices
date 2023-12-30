package com.example;
public class Square implements Shape {
    private double side;
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double calculatearea() {
       return side*side;
    }
    public double getSide() {
        return side;
    }
} 
