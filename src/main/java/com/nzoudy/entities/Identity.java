package com.nzoudy.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Identity implements Serializable{

	@Id
	private String nni;
	private String firstname;
	private String lastname;
	private String sex;
	private Date birthday;
	private String department;
	private String email;
	private int agentEDF;
	
	@OneToMany //(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="contract_identity")
	private List<Contract> contracts;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="role_identity")
	private List<Role> roles;

	public Identity() {}

	public Identity(String nni, String firstname, String lastname, String sex, Date birthday, String department,
			String email, int agentEDF) {
		this.nni = nni;
		this.firstname = firstname;
		this.lastname = lastname;
		this.sex = sex;
		this.birthday = birthday;
		this.department = department;
		this.email = email;
		this.agentEDF = agentEDF;
	}

	public String getNni() {
		return nni;
	}

	public void setNni(String nni) {
		this.nni = nni;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAgentEDF() {
		return agentEDF;
	}

	public void setAgentEDF(int agentEDF) {
		this.agentEDF = agentEDF;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	} 
	
	
}
