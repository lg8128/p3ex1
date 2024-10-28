package com.example.p3ex1;

public class Electronics extends Product{
    private String color;

    public Electronics(String name, double price, String Description,String color) {
        super(name, price, Description);
        this.color=color;
    }

@Override
    public String getDescription(){
        return "the color of the Electronic product is "+color;
    }

@Override
    public String getName(){
        return "this name of the Electronic prudoct is: "+name;
    }

@Override
    public double getPrice(){
        return price;
    }
}
