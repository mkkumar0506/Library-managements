package com.libararymanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libararymanagement.model.Book;

@Repository
public interface Bookrepository  extends JpaRepository<Book, Long>{


	

}
