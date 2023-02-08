package com.jsp.person.pan.aadhar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long pan_number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPan_number() {
		return pan_number;
	}

	public void setPan_number(long pan_number) {
		this.pan_number = pan_number;
	}

}
