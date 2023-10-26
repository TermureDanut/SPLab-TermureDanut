package com.example.lab2.classes;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String imageName;
    private String url;
    private List<Element> elements;
    public Image(String imageName) {
        this.imageName = imageName;
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void print (){
        System.out.println("Image: " + imageName);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

}
