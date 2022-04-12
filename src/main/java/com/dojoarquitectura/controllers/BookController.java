package com.dojoarquitectura.controllers;

import java.util.List;

import com.dojoarquitectura.models.BookModel;
import com.dojoarquitectura.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class BookController {
    
    @Autowired
    private BookService service;

    @GetMapping
    public List<BookModel> createBook() {
        return service.getAllBooks();
    }

}
