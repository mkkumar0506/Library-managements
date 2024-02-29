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
import com.libararymanagement.model.Member;
import com.libararymanagement.services.Memberservice;

@Controller
@RestController
@RequestMapping("/api/member")

public class Membercontroller {
	
	@Autowired
	private Memberservice memberservice;
	
	// Get all records
	@GetMapping
	public List<Member> getAllBooks() {
        return memberservice.findAll();
    }
	// view for individual records select to id
	@GetMapping("/{id}")
	public Member getBook(@PathVariable Long id) {
        return memberservice.findById(id);
    }
	
	// add Member in record
	@PostMapping("/addmember")
	 public Member addMember(@RequestBody Member member) {
	        return memberservice.save(member);
	    }
	
//  updating the correct book
	@PutMapping("/{id}")
	public Member updateBook(@PathVariable Integer id, @RequestBody Member member) {
        
        return memberservice.save(member);
	}
	
	//delete book in records
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
		memberservice.deleteById(id);
	    }

}
