package com.example.Classes.service.implementation;

import com.example.Classes.service.Command;
import org.springframework.stereotype.Component;

@Component
public class CommandDeleteBook implements Command<Void> {
    private final com.example.Classes.service.implementation.BookService bookService;
    Long id;

    public CommandDeleteBook(com.example.Classes.service.implementation.BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public Void execute() {
        bookService.deleteBook(id);
        return null;
    }

    public void setId(Long id){
        this.id=id;

    }
}
