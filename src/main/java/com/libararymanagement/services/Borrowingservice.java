package com.libararymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libararymanagement.model.Borrowing;
import com.libararymanagement.repository.Borrowingrepository;

@Service
public class Borrowingservice {

	@Autowired
	private Borrowingrepository borrowingrepo;

	private Borrowing borrow;

	// display all records
	public List<Borrowing> getAllBorrows() {
		return borrowingrepo.findAll();
	}

// display specific  record
	public Borrowing getBorrowById(Long id) {
		return borrowingrepo.findById(id).orElse(null);
	}


//delete
	public void deleteById(Long id) {
		borrowingrepo.deleteById(id);

	}
//add and update
	public Borrowing save(Borrowing borrow) {
		return borrowingrepo.save(borrow);	
		}

}
