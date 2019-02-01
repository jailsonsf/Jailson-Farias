package com.booksale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booksale.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
