package com.java.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.api.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
