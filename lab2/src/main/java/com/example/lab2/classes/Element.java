package com.example.lab2.classes;

import java.util.ArrayList;
import java.util.List;

public class Element {
    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;
    public Element(){
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void addImage(String imageName){
        Image image = new Image(imageName);
        this.images.add(image);
    }
    public void addParagraph(String text){
        Paragraph paragraph = new Paragraph(text);
        this.paragraphs.add(paragraph);
    }
    public void addTable(String title){
        Table table = new Table(title);
        this.tables.add(table);
    }
    public void print(){
        for (Image i : images){
            i.print();
        }
        for (Paragraph p : paragraphs){
            p.print();
        }
        for (Table t : tables){
            t.print();
        }
    }
}
