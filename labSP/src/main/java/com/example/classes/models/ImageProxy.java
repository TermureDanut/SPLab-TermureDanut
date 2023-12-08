package com.example.Classes.models;

import com.example.Classes.models.Image;
import com.example.Classes.service.Element;
import com.example.Classes.service.Visitor;

import java.util.Objects;

public class ImageProxy implements Element {

    private String imagename;
    private Image realImage= null;

    public ImageProxy(String imagename) {
        this.imagename = imagename;
    }

    public Image loadRealImage() {
        if (Objects.isNull(realImage)) {
            realImage = new Image(this.imagename);
        return realImage;
        }
        return realImage;
    }

    @Override
    public void print() {
        loadRealImage();
        realImage.print();
    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeElement(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
