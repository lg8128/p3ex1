package com.example.p3ex1;

public class Product {
    String name;
    double price;
    String Description;

    public Product (String name, double price, String Description){
        this.name =name;
        this.price=price;
        this.Description=Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return Description;
    }



}
