package com.dojoarquitectura.book.infrastructure;

import java.util.List;

import com.dojoarquitectura.book.application.BookService;
import com.dojoarquitectura.book.domain.BookModel;

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
