package com.nzoudy.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Role implements Serializable {

	@Id
	private String nameRole;
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	private String shortDescription;
	private String longDescription;
	
	@OneToMany
	private List<Perimeter> perimeters;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Profile> profiles;
	
	public Role() {}
	public Role(String nameRole, Date startDate, Date endDate, String shortDescription, String longDescription, List<Perimeter> perimeters, List<Profile> profiles) {
		this.nameRole = nameRole;
		this.startDate = startDate;
		this.endDate = endDate;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.perimeters = perimeters;
		this.profiles = profiles;
	}
	public String getNameRole() {
		return nameRole;
	}
	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	public List<Perimeter> getPerimeters() {
		return perimeters;
	}
	public void setPerimeters(List<Perimeter> perimeters) {
		this.perimeters = perimeters;
	}
	public List<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}
	
	
}
