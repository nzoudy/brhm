package com.nzoudy.service.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Profil")
@XmlType(propOrder={"nameProfile","longDescription","shortDescription"})
public class ProfileWS implements Serializable{

	private String nameProfile;
	private String shortDescription;
	private String longDescription;
	
	public ProfileWS() {}
	
	public ProfileWS(String nameProfile, String shortDescription, String longDescription) {
		this.nameProfile = nameProfile;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	@XmlElement(name="nomProfil")
	public String getNameProfile() {
		return nameProfile;
	}
	public void setNameProfile(String nameProfile) {
		this.nameProfile = nameProfile;
	}
	
	// @XmlTransient
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	// @XmlTransient
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
}
