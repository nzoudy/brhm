package com.nzoudy.service.model;

import java.io.Serializable;

public class PerimeterWS implements Serializable{

	private String code;

	public PerimeterWS() {}

	public PerimeterWS(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
