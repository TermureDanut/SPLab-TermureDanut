package com.example.lab2.classes;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements;
    public SubChapter (String name){
        this.name = name;
        this.elements = new ArrayList<>();
    }
    public void addElement (Element element){
        this.elements.add(element);
    }
    public void print(){
        System.out.println("Subchapter name: " + name);
        for (Element e : elements){
            e.print();
        }
    }
}
