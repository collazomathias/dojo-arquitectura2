package com.dojoarquitectura.repositories;

import java.util.ArrayList;
import java.util.List;

import com.dojoarquitectura.models.BookModel;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    
    private List<BookModel> books = new ArrayList<>(){
        {
            add(new BookModel("El señor de los anillos", "J.R.R. Tolkien"));
            add(new BookModel("El señor de los anillos 2", "J.R.R. Tolkien"));
            add(new BookModel("El señor de los anillos 3", "J.R.R. Tolkien"));
            add(new BookModel("El señor de los anillos 4", "J.R.R. Tolkien"));
            add(new BookModel("El señor de los anillos 5", "J.R.R. Tolkien"));
        }
    };

    public List<BookModel> getBooks() {
        return books;
    }

}
