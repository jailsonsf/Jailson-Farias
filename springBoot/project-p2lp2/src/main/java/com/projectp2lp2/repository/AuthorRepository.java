package com.projectp2lp2.repository;

import com.projectp2lp2.domain.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>
{
    
}