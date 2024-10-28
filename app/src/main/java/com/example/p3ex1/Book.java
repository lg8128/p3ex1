package com.example.p3ex1;

public class Book extends Product{
    private String writer;

    public Book(String name, double price, String Description,String writer) {
        super(name, price, Description);
        this.writer=writer;
    }

@Override
    public String getDescription(){
        return "this book writen by: "+writer;
    }


@Override
    public String getName(){
        return "this book is: "+name;
    }

@Override
    public double getPrice(){
        return price;
    }
}
