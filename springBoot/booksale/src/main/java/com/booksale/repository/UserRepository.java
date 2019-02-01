package com.booksale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.booksale.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
    
}