package com.booksale.resources;

import java.net.URI;
import java.util.List;

import com.booksale.domain.Author;
import com.booksale.domain.Book;
import com.booksale.repository.AuthorRepository;
import com.booksale.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AuthorResources
{
    @Autowired
    private AuthorRepository repository;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/authors")
    public List<Author> getAllAuthor ()
    {
        List<Author> authors = repository.findAll();

        return authors;
    }

    @PostMapping("/authors")
    public ResponseEntity<?> saveAuthor (@RequestBody Author author)
    {
        Author savedAuthor = repository.save(author);

        List<Book> books = savedAuthor.getAllBooks();
        savedAuthor.setBooks(books);

        for (Book eachBooks : books)
        {
            eachBooks.setAuthor(savedAuthor);
            bookRepository.save(eachBooks);
        }

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedAuthor.getId()).
            toUri();

        return ResponseEntity.created(uri).body("Nome e Id do novo autor: " + 
            savedAuthor.getName() + " - " + savedAuthor.getId());
    }
    
}