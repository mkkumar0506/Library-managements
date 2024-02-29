package com.libararymanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.libararymanagement.model.Borrowing;
import com.libararymanagement.model.Member;
import com.libararymanagement.services.Borrowingservice;

@RestController
@RequestMapping("/borrows")
public class Borrowingcontroller {

	@Autowired
	private Borrowingservice borrowservice;

	// get all borrow details
	@GetMapping
	public List<Borrowing> getAllBorrows() {
		return borrowservice.getAllBorrows();
	}

	// get to specific borrow records
	@GetMapping("/{id}")
	public Borrowing getBorrowById(@PathVariable Long id) {
		return borrowservice.getBorrowById(id);
	}

	// add the borrow details in records
	@PostMapping("/addborrow")
	 public Borrowing addBorrow(@RequestBody Borrowing borrow) {
	        return borrowservice.save(borrow);
	    }

	@DeleteMapping("/{id}")
	public void deleteBorrow(@PathVariable Long id) {
		borrowservice.deleteById(id);
	}

	// specific data update and return
	@PutMapping("/return/{id}")
    public Borrowing updateborrow(@PathVariable Integer id, @RequestBody Borrowing borrow) {   
        return borrowservice .save(borrow);
	}
	

}
