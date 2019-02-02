package com.booksale.resources;

import java.util.List;

import com.booksale.domain.BookPublisher;
import com.booksale.repository.BookPublisherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookPublisherResources
{
    @Autowired
    private BookPublisherRepository repository;

    @GetMapping("/bookPublisher")
    public List<BookPublisher> getAll()
    {
        List<BookPublisher> bookPublishers = repository.findAll();

        return bookPublishers;
    }
}