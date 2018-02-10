package com.nzoudy.service.model;

import java.io.Serializable;

public class OrganizationWS implements Serializable{

	private String path;

	public OrganizationWS() {}

	public OrganizationWS(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	} 
}
