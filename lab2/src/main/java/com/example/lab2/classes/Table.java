package com.example.lab2.classes;

import java.util.List;

public class Table implements Element{
    private String title;
    private List<Element> elements;
    public Table(String title) {
        this.title = title;
    }
    public void print (){
        System.out.println("Table: " + title);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }
}
