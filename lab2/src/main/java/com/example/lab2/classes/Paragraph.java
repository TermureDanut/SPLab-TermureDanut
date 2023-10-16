package com.example.lab2.classes;

public class Paragraph {
    private String text;
    public Paragraph(String text) {
        this.text = text;
    }
    public void print (){
        System.out.println("Text: " + text);
    }
}
