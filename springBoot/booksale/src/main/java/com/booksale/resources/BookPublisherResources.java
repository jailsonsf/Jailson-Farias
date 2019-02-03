package com.booksale.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.booksale.domain.BookPublisher;
import com.booksale.repository.BookPublisherRepository;

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
public class BookPublisherResources
{
    @Autowired
    private BookPublisherRepository repository;

    @GetMapping("/bookPublishers")
    public List<BookPublisher> getAll()
    {
        List<BookPublisher> bookPublishers = repository.findAll();

        return bookPublishers;
    }

    @PostMapping("/bookPublishers")
    public ResponseEntity<?> saveBookPublisher(@RequestBody BookPublisher bookPublisher)
    {
        BookPublisher savedBookPublisher = repository.save(bookPublisher);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedBookPublisher.getId()).
            toUri();

        return ResponseEntity.created(uri).body("Name and Id of the new Book Publisher: " +
            savedBookPublisher.getName() + " - " + savedBookPublisher.getId());
    }

    @PutMapping("/bookPublishers/{id}")
    public ResponseEntity<?> updateAuthor (@RequestBody BookPublisher bookPublisher, @PathVariable int id)
    {
        Optional<BookPublisher> bookPublisherFound = repository.findById(id);

        if (!bookPublisherFound.isPresent())
        {
            return ResponseEntity.notFound().build();
        }

        bookPublisher.setId(id);
        repository.save(bookPublisher);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/bookPubishers/{id}")
    public void deleteAuthor(@PathVariable int id)
    {
        Optional<BookPublisher> bookPublisherFound = repository.findById(id);

        if (bookPublisherFound.isPresent())
        {
            repository.deleteById(id);
        }
    }
}