package com.example.lab2.classes;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;
    public Chapter (String name){
        this.name = name;
        this.subChapters = new ArrayList<>();
    }
    public int addSubChapter(String subChapterName){
        SubChapter subChapter = new SubChapter(subChapterName);
        this.subChapters.add(subChapter);
        return this.subChapters.indexOf(subChapter);
    }
    public SubChapter getSubChapter (int index) {
        return subChapters.get(index);
    }
    public void print(){
        System.out.println("Chapter name: " + name);
        for (SubChapter sc : subChapters){
            System.out.println("SubChapter number: " + (subChapters.indexOf(sc) + 1));
            sc.print();
        }
    }
}
