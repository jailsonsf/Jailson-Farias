package com.projectp2lp2.repository;

import com.projectp2lp2.domain.BookPublisher;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRepository extends JpaRepository <BookPublisher, Integer>
{

}