package com.booksale.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Genre
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Book> books;

    public Genre (){}

    public Genre (String name, String description)
    {
        super();
        setName (name);
        setDescription (description);
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

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setId(int id)
    {
        this.id = id;
	}

}