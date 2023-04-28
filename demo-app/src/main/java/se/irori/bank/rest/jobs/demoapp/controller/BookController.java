package se.irori.bank.rest.jobs.demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import se.irori.bank.rest.jobs.demoapp.services.BookService;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String getBooks(Model model)
    {
        model.addAttribute("books",bookService.findall());

        return "books";
    }
}   
