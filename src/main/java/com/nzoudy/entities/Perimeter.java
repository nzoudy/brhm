package com.nzoudy.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perimeter implements Serializable{

	@Id
	private String code;

	public Perimeter() {}

	public Perimeter(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
