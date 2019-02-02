package com.booksale.resources;

import java.util.List;

import com.booksale.domain.Genre;
import com.booksale.repository.GenreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenreResources
{
    @Autowired
    private GenreRepository repository;

    @GetMapping("/genres")
    public List<Genre> getAll()
    {
        List<Genre> genres = repository.findAll();

        return genres;
    }
}