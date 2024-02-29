package com.libararymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libararymanagement.model.Member;

@Repository
public interface Memberrepository extends JpaRepository<Member,Long> {

}
