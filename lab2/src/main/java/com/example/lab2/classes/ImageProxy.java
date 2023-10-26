package com.example.lab2.classes;

public class ImageProxy implements Picture, Element{
    private String url;
    private Image realImage;
    public ImageProxy(String url){
        this.realImage = null;
        this.url = url;
    }
    public Image loadImage (){
        if (realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
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
