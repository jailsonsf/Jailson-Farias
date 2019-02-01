package com.projectp2lp2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int age;
    private String nationaly;
    
    public Author (){}

    public Author (String name, int age, String nationaly)
    {
        setName (name);
        setAge (age);
        setNationaly (nationaly);
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

    public void setNationaly (String nationaly)
    {
        this.nationaly = nationaly;
    }

    public String getNationaly ()
    {
        return nationaly;
    }
}