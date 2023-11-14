package com.example.classes;

public interface Element {
    void print();
    void add(Element e);
    void removeElement(Element e);
    Element get(int i);
}