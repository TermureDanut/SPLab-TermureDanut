package com.example.Classes.service;

public interface Element extends com.example.Classes.service.implementation.Visitee {
    void print();
    void add(Element e);
    void removeElement(Element e);
    Element get(int i);
}
