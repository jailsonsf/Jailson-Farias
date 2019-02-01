package com.projectp2lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectp2lp2.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
