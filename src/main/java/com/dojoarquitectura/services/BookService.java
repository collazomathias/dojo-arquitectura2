package com.dojoarquitectura.services;

import java.util.List;

import com.dojoarquitectura.models.BookModel;
import com.dojoarquitectura.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;
 
    public List<BookModel> getAllBooks() {
        return repository.getBooks();
    }

}
