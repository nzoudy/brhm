package com.nzoudy.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile implements Serializable{

	@Id
	private String nameProfile;
	private String shortDescription;
	private String longDescription;
	
	public Profile() {}
	public Profile(String nameProfile, String shortDescription, String longDescription) {
		super();
		this.nameProfile = nameProfile;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	public String getNameProfile() {
		return nameProfile;
	}
	public void setNameProfile(String nameProfile) {
		this.nameProfile = nameProfile;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}	
	
}
