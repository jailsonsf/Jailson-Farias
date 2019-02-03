package com.booksale.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.booksale.domain.Book;
import com.booksale.repository.BookRepository;

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

    @PostMapping("/books")
    public ResponseEntity<?> saveBook(@RequestBody Book book)
    {
        Book savedBook = repository.save(book);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedBook.getId()).
            toUri();

        return ResponseEntity.created(uri).body("Name and Id of the new Book Publisher: " +
            savedBook.getTitle() + " - " + savedBook.getId());
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<?> updateAuthor (@RequestBody Book book, @PathVariable int id)
    {
        Optional<Book> bookFound = repository.findById(id);

        if (!bookFound.isPresent())
        {
            return ResponseEntity.notFound().build();
        }

        book.setId(id);
        repository.save(book);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/books/{id}")
    public void deleteAuthor(@PathVariable int id)
    {
        Optional<Book> bookFound = repository.findById(id);

        if (bookFound.isPresent())
        {
            repository.deleteById(id);
        }
    }
}