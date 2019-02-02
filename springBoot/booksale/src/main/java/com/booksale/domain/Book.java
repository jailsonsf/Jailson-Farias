package com.booksale.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne(optional = false)
    @JoinColumn(name = "bookpublisher_id")
    private BookPublisher bookPublisher;

    public Book (){}

    public Book (Integer id, String title, String description, Author author, BookPublisher bookPublisher)
    {
        super();
        setTitle (title);
        setDescription (description);
        setAuthor (author);
        setBookPublisher (bookPublisher);
    }

    public Integer getId ()
    {
        return id;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setAuthor (Author author)
    {
        this.author = author;
    }

    public Author getAuthor ()
    {
        return author;
    }

    public void setBookPublisher (BookPublisher bookPublisher)
    {
        this.bookPublisher = bookPublisher;
    }

    public BookPublisher getBookPublisher ()
    {
        return bookPublisher;
    }

}