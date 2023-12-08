package com.example.Classes.service.implementation;

import com.example.Classes.models.Book;
import com.example.Classes.service.Command;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CommandGetBooks implements Command<List<Book>> {
    private final com.example.Classes.service.implementation.BookService bookService;

    public CommandGetBooks(com.example.Classes.service.implementation.BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public List<Book> execute() {
        return bookService.getBooks();


    }
}
