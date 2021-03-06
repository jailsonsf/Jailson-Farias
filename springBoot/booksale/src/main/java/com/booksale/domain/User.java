package com.booksale.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int age;
    private String address;

    public User (){}

    public User (String name, int age, String address)
    {
        super();
        setName (name);
        setAge (age);
        setAddress (address);
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

    public void setAge (int age)
    {
        this.age = age;
    }

    public int getAge ()
    {
        return age;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setId(int id)
    {
        this.id = id;
	}
}