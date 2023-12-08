package com.example.Classes.service;


import com.example.Classes.models.*;

public interface Visitor {
    void visitBook(Book book);
    void visitSection(Section section);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
    void visitTableOfContent(TableOfContent tableOfContent);
}
