package com.libararymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libararymanagement.model.Book;
import com.libararymanagement.services.Bookservice;

@Controller
@RestController
@RequestMapping("/api/book")
public class Bookcontroller {
	
	@Autowired
	private Bookservice bookservice;
	
	@GetMapping
	public List<Book> getAllBooks() {
        return bookservice.findAll();
    }
	
	@GetMapping("/{id}")
	public Book getBook(@PathVariable Long id) {
        return bookservice.findById(id);
    }
	
	@PostMapping("/addbook")
	 public Book addBook(@RequestBody Book book) {
	        return bookservice.save(book);
	    }
	
//  updating the correct book
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
        
        return bookservice.save(book);
	}
	
	//delete book in records
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
	        bookservice.deleteById(id);
	    }
	

}

