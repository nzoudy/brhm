package com.nzoudy.service.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Identity")
public class IdentityWS implements Serializable{

	private String E;
	private String nni;
	private String firstname;
	private String lastname;
	private String sex;
	private Date birthday;
	private String department;
	private String email;
	private int agentEDF;
	
	private OrganizationWS organizationWS;
	private List<ContractWS> contractWS;
	private List<RoleWS> roleWS;
	
	public IdentityWS() {}

	public IdentityWS(String nni, String firstname, String lastname, String sex, Date birthday, String department,
			String email, int agentEDF, OrganizationWS organizationWS, List<ContractWS> contractWS, List<RoleWS> roleWS) {
		super();
		this.nni = nni;
		this.firstname = firstname;
		this.lastname = lastname;
		this.sex = sex;
		this.birthday = birthday;
		this.department = department;
		this.email = email;
		this.agentEDF = agentEDF;
		this.organizationWS = organizationWS;
		this.contractWS = contractWS;
		this.roleWS = roleWS;
	}
	
	public String getE() {
		return E;
	}

	public void setE(String e) {
		E = e;
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

	public OrganizationWS getOrganizationWS() {
		return organizationWS;
	}

	public void setOrganizationWS(OrganizationWS organizationWS) {
		this.organizationWS = organizationWS;
	}

	public List<ContractWS> getContractWS() {
		return contractWS;
	}

	public void setContractWS(List<ContractWS> contractWS) {
		this.contractWS = contractWS;
	}

	public List<RoleWS> getRoleWS() {
		return roleWS;
	}

	public void setRoleWS(List<RoleWS> roleWS) {
		this.roleWS = roleWS;
	}
	
}
