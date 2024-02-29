package com.libararymanagement.model;

import jakarta.persistence.Entity;
import java.util.Date;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Borrowing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private long memberId;
	private long bookId;
	private Date borrowedDate;
	private Date dueDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public Date getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Borrowing(long id, long memberId, long bookId, Date borrowedDate, Date dueDate) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.bookId = bookId;
		this.borrowedDate = borrowedDate;
		this.dueDate = dueDate;
	}

}
