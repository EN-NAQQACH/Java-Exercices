package com.example;

public class Reader {
   public  String name;

    public Reader() {
        this.name = "name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Reader{name='" + name + "'}";
    }
    
}
