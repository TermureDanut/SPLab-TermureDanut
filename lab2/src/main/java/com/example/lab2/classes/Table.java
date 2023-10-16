package com.example.lab2.classes;

public class Table {
    private String title;
    public Table(String title) {
        this.title = title;
    }
    public void print (){
        System.out.println("Table title: " + title);
    }
}
