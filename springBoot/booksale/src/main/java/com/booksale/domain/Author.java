package com.booksale.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int age;
    private String nationaly;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Book> books;

    public Author() {
    }

    public Author(String name, int age, String nationaly) {
        super();
        setName(name);
        setAge(age);
        setNationaly(nationaly);
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNationaly(String nationaly) {
        this.nationaly = nationaly;
    }

    public String getNationaly() {
        return nationaly;
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