package com.java.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.model.Book;
import com.java.api.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/book")
@Api(value = "Book Service", description = "My Book Store") //For description in swagger ui
public class BookController {
	
	@Autowired
	private BookService service;

	@PostMapping("/save")
	@ApiOperation(value = "store book api")  //For custom operation name in swagger ui
	public String saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}

	@ApiOperation(value = "search book api")//For custom operation name in swagger ui
	@GetMapping("/searchBook/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return service.getBook(bookId);
	}

	@DeleteMapping("/deleteBook/{bookId}")
	@ApiOperation(value = "Delete book api")//For custom operation name in swagger ui 
	public List<Book> deleteBook(@PathVariable int bookId) {
		return service.removeBook(bookId);

	}

}
