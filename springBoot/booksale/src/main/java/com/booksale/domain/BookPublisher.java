package com.projectp2lp2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookPublisher
{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String cnpj;

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

}