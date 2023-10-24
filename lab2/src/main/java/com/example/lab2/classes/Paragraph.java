package com.example.lab2.classes;

import java.util.List;

public class Paragraph implements Element{
    private String text;
    private List<Element> elements;
    public Paragraph(String text) {
        this.text = text;
    }
    public void print (){
        System.out.println("Paragraph: " + text);
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
