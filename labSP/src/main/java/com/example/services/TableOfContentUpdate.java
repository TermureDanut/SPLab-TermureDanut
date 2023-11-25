package com.example.services;

import com.example.classes.*;

public class TableOfContentUpdate implements Visitor {
    private TableOfContents toc;
    private int currentPage = 1;

    public TableOfContentUpdate(TableOfContents toc) {
        this.toc = toc;
    }
    @Override
    public void visitBook(Book book) {}
    @Override
    public void visitSection(Section section) {
        toc.addEntry(section.getName(), currentPage);
        currentPage++;
    }
    @Override
    public void visitSubchapter(SubChapter sub){
        toc.addEntry(sub.getTitle(), currentPage);
        currentPage++;
    }
    @Override
    public void visitParagraph(Paragraph paragraph) {
        currentPage++;
    }
    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        currentPage++;
    }
    @Override
    public void visitImage(Image image) {
        currentPage++;
    }
    @Override
    public void visitTable(Table table) {
        currentPage++;
    }
}