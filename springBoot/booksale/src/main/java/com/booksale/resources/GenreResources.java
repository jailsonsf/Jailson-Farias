package com.booksale.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.booksale.domain.Genre;
import com.booksale.repository.GenreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @PostMapping("/genres")
    public ResponseEntity<?> saveAuthor (@RequestBody Genre genre)
    {
        Genre savedGenre = repository.save(genre);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedGenre.getId()).
            toUri();

        return ResponseEntity.created(uri).body("Nome e id do novo Autor: " +
            savedGenre.getName() + " - " + savedGenre.getId());
    }

    @PutMapping("/genres/{id}")
    public ResponseEntity<?> updateAuthor (@RequestBody Genre genre, @PathVariable int id)
    {
        Optional<Genre> genreFound = repository.findById(id);

        if (!genreFound.isPresent())
        {
            return ResponseEntity.notFound().build();
        }

        genre.setId(id);
        repository.save(genre);

        return ResponseEntity.noContent().build();
    }
    
    @DeleteMapping("/genres/{id}")
    public void deleteAuthor(@PathVariable int id)
    {
        Optional<Genre> genreFound = repository.findById(id);

        if (genreFound.isPresent())
        {
            repository.deleteById(id);
        }
    }
}