package com.booksale.resources;

import java.util.List;
import java.util.Optional;

import com.booksale.domain.Author;
import com.booksale.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PutMapping("/authors/{id}")
    public ResponseEntity<?> updateAuthor (@RequestBody Author author, @PathVariable int id)
    {
        Optional<Author> authorFound = repository.findById(id);

        if (!authorFound.isPresent())
        {
            return ResponseEntity.notFound().build();
        }

        author.setId(id);
        repository.save(author);

        return ResponseEntity.noContent().build();
    }
    
    @DeleteMapping("/persons/{id}")
    public void deleteAuthor(@PathVariable int id)
    {
        Optional<Author> authorFound = repository.findById(id);

        if (authorFound.isPresent())
        {
            repository.deleteById(id);
        }
    }
}