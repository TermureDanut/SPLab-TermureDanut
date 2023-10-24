package com.example.lab2.classes;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private String title;
    private Author author;
    public List<Element> elements;
    public Book(String title){
        super(title);
        this.title = title;
        this.elements = new ArrayList<>();
    }
    public void addElement(Element e){
        this.elements.add(e);
    }
    public void addAuthor(Author author){
        this.author = author;
    }
    public void print(){
        super.print();
        author.print();
        for (Element e : elements){
            e.print();
        }
    }
}
