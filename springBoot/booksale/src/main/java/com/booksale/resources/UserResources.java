package com.booksale.resources;

import java.util.List;

import com.booksale.domain.User;
import com.booksale.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResources
{
    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<User> getAll()
    {
        List<User> users = repository.findAll();

        return users;
    }
}