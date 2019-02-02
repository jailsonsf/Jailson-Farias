package com.booksale.resources;

import java.util.List;

import com.booksale.domain.Author;
import com.booksale.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthorResources
{
    @Autowired
    private AuthorRepository repository;

    @GetMapping("/authors")
    public List<Author> getAllAuthor ()
    {
        List<Author> authors = repository.findAll();

        return authors;
    }
    
}