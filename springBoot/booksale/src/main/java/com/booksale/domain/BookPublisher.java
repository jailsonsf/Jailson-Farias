package com.booksale.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BookPublisher
{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String cnpj;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookPublisher")
    private List<Book> books;

    public BookPublisher (){}

    public BookPublisher (String name, String cnpj)
    {

        setName (name);
        setCnpj (cnpj);
    }

    public Integer getId ()
    {
        return id;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return name;
    }

    public void setCnpj (String cnpj)
    {
        this.cnpj = cnpj;
    }

    public String getCnpj ()
    {
        return cnpj;
    }

    public void setBooks (List<Book> books)
    {
        this.books = books;
    }

    public List<Book> getAllBooks ()
    {
        return books;
    }

}