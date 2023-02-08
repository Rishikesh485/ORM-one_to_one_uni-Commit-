 package com.jsp.person.pan.aadhar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long aadhar_number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(long aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

}
