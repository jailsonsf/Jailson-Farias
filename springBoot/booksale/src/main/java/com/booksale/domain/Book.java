package com.booksale.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;

    public Book (){}

    public Book (String title, String description)
    {
        super();
        setTitle (title);
        setDescription (description);
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

}