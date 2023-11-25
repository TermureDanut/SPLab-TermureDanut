package com.example.classes;

import java.util.ArrayList;
import java.util.List;
public class Chapter {
    private String name;

    private List<SubChapter> subchapterList;

    public Chapter(String name, List<SubChapter> subchapters){
        this.name=name;
        subchapterList = subchapters;
    }

    public Chapter(String name){
        this.name = name;
        subchapterList = null;
    }
    public void print(){
        System.out.println("Chapter name: " + name);
    }

    public int createSubChapter(String title) {
        if(subchapterList == null)
            subchapterList = new ArrayList<SubChapter>();
        subchapterList.add(new SubChapter(title));
        return subchapterList.size();
    }

    public SubChapter getSubChapter(int index) {
        return subchapterList.get(index - 1);
    }
}