package com.booksale.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.booksale.domain.User;
import com.booksale.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @PostMapping("/users")
    public ResponseEntity<?> saveAuthor (@RequestBody User user)
    {
        User savedUser = repository.save(user);

        URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(savedUser.getId()).
            toUri();

        return ResponseEntity.created(uri).body("Nome e id do novo Usuário: " +
            savedUser.getName() + " - " + savedUser.getId());
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> updateAuthor (@RequestBody User user, @PathVariable int id)
    {
        Optional<User> userFound = repository.findById(id);

        if (!userFound.isPresent())
        {
            return ResponseEntity.notFound().build();
        }

        user.setId(id);
        repository.save(user);

        return ResponseEntity.noContent().build();
    }
    
    @DeleteMapping("/users/{id}")
    public void deleteAuthor(@PathVariable int id)
    {
        Optional<User> userFound = repository.findById(id);

        if (userFound.isPresent())
        {
            repository.deleteById(id);
        }
    }
}