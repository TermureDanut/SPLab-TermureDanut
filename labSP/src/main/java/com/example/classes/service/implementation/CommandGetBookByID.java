package com.example.Classes.service.implementation;

import com.example.Classes.models.Book;
import com.example.Classes.service.Command;
import org.springframework.stereotype.Component;

@Component
public class CommandGetBookByID implements Command<Book> {
    private final com.example.Classes.service.implementation.BookService bookService;
    Long id;
    public CommandGetBookByID(com.example.Classes.service.implementation.BookService bookService) {
        this.bookService = bookService;
    }


    @Override
    public Book execute() {
        return bookService.getBookById(id);
    }

    public void setID(Long id){
        this.id = id;

    }

}
