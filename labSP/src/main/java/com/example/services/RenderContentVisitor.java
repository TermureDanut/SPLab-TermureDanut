package com.example.services;

import com.example.classes.*;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.loadImage().accept(this);
    }

    @Override
    public void visitImage(Image image) {
        System.out.println("Image with name: " + image.getImageName());
    }

    @Override
    public void visitTable(Table table) {
        System.out.println("Table: " + table.getTitle());
    }

    @Override
    public void visitSection(Section section) {
        System.out.println("Section: " + section.getName());
        for (Element element : section.getContent()) {
            element.accept(this);
        }
    }

    @Override
    public void visitSubchapter(SubChapter sub) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        System.out.println("Paragraph: " + paragraph.getText());
    }

    @Override
    public void visitBook(Book book) {
        System.out.println("Book: " + book.getTitle());
        System.out.print("Authors: ");
        for (Author author : book.getAuthors()) {
            author.print();
        }
        for (Element section : book.getSections()) {
            section.accept(this);
        }

    }
}
