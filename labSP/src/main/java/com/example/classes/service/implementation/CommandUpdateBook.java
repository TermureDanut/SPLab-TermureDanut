package com.example.Classes.service.implementation;

import com.example.Classes.models.Book;
import com.example.Classes.service.Command;
import org.springframework.stereotype.Component;

@Component
public class CommandUpdateBook implements Command<Book> {
    private final com.example.Classes.service.implementation.BookService bookService;
    Long id;
    Book book;
    public CommandUpdateBook(com.example.Classes.service.implementation.BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public Book execute() {
        bookService.updateBook(id,book);
        return this.book;
    }

    public void setBook(Long id, Book book)
    {
        this.id = id;
        this.book = book;

    }
}
