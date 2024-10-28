package com.example.p3ex1;

public class Clothing extends Product{
    private String size;

    public Clothing(String name, double price, String Description, String size) {
        super(name, price, Description);
        this.size=size;
    }

    @Override
    public String getDescription(){
        return "the size of this cloth is:  "+size;
    }

    @Override
    public String getName(){
        return "this cloth is: "+name;
    }

    @Override
    public double getPrice(){
        return price;
    }

}
