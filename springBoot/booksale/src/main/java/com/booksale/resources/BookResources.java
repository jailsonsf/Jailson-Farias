package com.booksale.resources;

import java.util.List;

import com.booksale.domain.Book;
import com.booksale.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResources
{
    @Autowired
    private BookRepository repository;

    @GetMapping("/books")
    public List<Book> getAll()
    {
        List<Book> books = repository.findAll();

        return books;
    }

}