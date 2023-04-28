package se.irori.bank.rest.jobs.demoapp.controller;

import org.springframework.stereotype.Controller;
import se.irori.bank.rest.jobs.demoapp.services.AuthorService;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService)
    {
        this.authorService = authorService;
    }

    public String getAuthors(Model model)
    {
        model.addAllAtribute("authors", authorService.findall());
    }
}
