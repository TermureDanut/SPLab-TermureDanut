package com.example.lab2.classes;

import java.util.List;

public class Image implements Element{
    private String imageName;
    private List<Element> elements;
    public Image(String imageName) {
        this.imageName = imageName;
    }
    public void print (){
        System.out.println("Image: " + imageName);
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
