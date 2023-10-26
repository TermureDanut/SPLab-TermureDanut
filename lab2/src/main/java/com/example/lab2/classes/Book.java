package com.example.lab2.classes;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapters;
    public Book(String title){
        this.title = title;
        this.chapters = new ArrayList<>();
    }
    public void addAuthor(Author author){
        this.author = author;
    }
    public int addChapter(String chapterTitle){
        Chapter chapter = new Chapter(chapterTitle);
        this.chapters.add(chapter);
        return chapters.indexOf(chapter);
    }
    public Chapter getChapter (int index){
        return chapters.get(index);
    }
    public void print(){
        System.out.println("Book title: " + title);
        author.print();
        for (Chapter c : chapters){
            System.out.println("Chapter number: " + (chapters.indexOf(c) + 1));
            c.print();
        }
    }
}
