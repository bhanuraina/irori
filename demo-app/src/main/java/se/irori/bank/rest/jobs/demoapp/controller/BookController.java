package se.irori.bank.rest.jobs.demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import se.irori.bank.rest.jobs.demoapp.services.BookService;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    
    pulic String getBooks(Model model)
    {
        model.addAllAttributes("books",bookService.findall());
    }
}   
