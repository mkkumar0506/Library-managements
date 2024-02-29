package com.libararymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libararymanagement.model.Book;
import com.libararymanagement.repository.Bookrepository;

@Service
public class Bookservice {

	@Autowired
	private Bookrepository Bookrepo;

	// display all records
	public List<Book> findAll() {
		return Bookrepo.findAll();
	}

	// display specific record
	public Book findById(Long id) {
		return Bookrepo.findById(id).orElse(null);
	}

	// add and update
	public Book save(Book book) {
		return Bookrepo.save(book);
	}

	// delete
	public void deleteById(Long id) {
		Bookrepo.deleteById(id);
	}

}
