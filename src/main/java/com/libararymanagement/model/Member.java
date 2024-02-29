package com.libararymanagement.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String name;
	private long phone;
	private Date registeredDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	public Member(long id, String name, long phone, Date registeredDate) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.registeredDate = registeredDate;
	}


	
	
	
}
