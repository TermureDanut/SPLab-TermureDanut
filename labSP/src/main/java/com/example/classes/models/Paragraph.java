package com.example.Classes.models;

import com.example.Classes.service.AlignStrategy;
import com.example.Classes.service.*;
import com.example.Classes.service.implementation.AlignLeft;
import com.example.Classes.service.implementation.Visitee;
import lombok.Data;

@Data
public class Paragraph implements Element, Visitee {
    private String name;
    private AlignStrategy align;
    public Paragraph(String name){
        this.name = name;
        align = new AlignLeft();
    }

    @Override
    public void print(){
        if(align == null)
            System.out.println("Paragraph: " + name);
        else
            align.render(name);
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


    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}