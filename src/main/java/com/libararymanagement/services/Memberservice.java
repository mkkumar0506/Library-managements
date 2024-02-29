package com.libararymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libararymanagement.model.Member;
import com.libararymanagement.repository.Memberrepository;

@Service
public class Memberservice {

	@Autowired
	private Memberrepository memberrepo;

	// display all records
	public List<Member> findAll() {
		return memberrepo.findAll();
	}

	// display specific record
	public Member findById(Long id) {
		return memberrepo.findById(id).orElse(null);
	}

	// Add and update records
	public Member save(Member member) {
		return memberrepo.save(member);
	}

	// delete
	public void deleteById(Long id) {
		memberrepo.deleteById(id);
	}

}
