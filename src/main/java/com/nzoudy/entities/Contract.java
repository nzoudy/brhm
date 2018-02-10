package com.nzoudy.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contract implements Serializable{

	@Id
	private String idContract;
	private Date startDate;
	private Date endDate;
	private String company;
	private String nniReferent;
	
	@ManyToOne
	@JoinColumn(name="organisation_du_contract")
	private Organization organization;

	public Contract() {}

	public Contract(String idContract, Date startDate, Date endDate, String company, String nniReferent, Organization organization) {
		this.idContract = idContract;
		this.startDate = startDate;
		this.endDate = endDate;
		this.company = company;
		this.nniReferent = nniReferent;
		this.organization = organization;
	}

	public String getIdContract() {
		return idContract;
	}

	public void setIdContract(String idContract) {
		this.idContract = idContract;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getNniReferent() {
		return nniReferent;
	}

	public void setNniReferent(String nniReferent) {
		this.nniReferent = nniReferent;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
	
}
