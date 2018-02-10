package com.nzoudy.service.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.nzoudy.entities.Perimeter;

public class RoleWS implements Serializable{

	private String nameRole;
	private Date startDate;
	private Date endDate;
	private List<PerimeterWS> perimeters;
	
	public RoleWS() {}

	public RoleWS(String nameRole, Date startDate, Date endDate, List<PerimeterWS> perimeters) {
		this.nameRole = nameRole;
		this.startDate = startDate;
		this.endDate = endDate;
		this.perimeters = perimeters;
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

	public List<PerimeterWS> getPerimeters() {
		return perimeters;
	}

	public void setPerimeters(List<PerimeterWS> perimeters) {
		this.perimeters = perimeters;
	}

}
