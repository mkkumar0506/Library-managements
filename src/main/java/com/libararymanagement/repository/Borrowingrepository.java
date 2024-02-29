package com.libararymanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libararymanagement.model.Borrowing;

@Repository
public interface Borrowingrepository extends JpaRepository<Borrowing, Long>  {



}
