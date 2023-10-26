package com.example.lab2.classes;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;
    private List<Element> elements;
    public Section (String title){
        this.title = title;
        this.elements = new ArrayList<>();
    }
    public void print() {
        System.out.println("Title: " + title);
        for (Element e : elements){
            e.print();
        }
    }

    @Override
    public void add(Element e) {
        this.elements.add(e);
    }

    @Override
    public void remove(Element e) {
        int index = this.elements.indexOf(e);
        this.elements.remove(index);
    }

    @Override
    public Element get(int index) {
        return this.elements.get(index);
    }
}
