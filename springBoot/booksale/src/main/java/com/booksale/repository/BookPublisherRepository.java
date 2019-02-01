package com.booksale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.booksale.domain.BookPublisher;

public interface BookPublisherRepository extends JpaRepository<BookPublisher, Integer>
{

}