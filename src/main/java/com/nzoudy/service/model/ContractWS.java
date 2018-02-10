package com.nzoudy.service.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.nzoudy.entities.Organization;

public class ContractWS implements Serializable{

	private String idContract;
	private Date startDate;
	private Date endDate;
	private String company;
	private String nniReferent;	
	private Organization organization;
	
	public ContractWS() {}
	
	public ContractWS(String idContract, Date startDate, Date endDate, String company, String nniReferent, Organization organization) {
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
