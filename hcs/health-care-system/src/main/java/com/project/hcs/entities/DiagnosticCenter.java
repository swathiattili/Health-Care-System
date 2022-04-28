package com.project.hcs.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//import com.project.springboot.hcs.model.DiagnosticTest;

@Entity
@Table(name = "diagnostic_center")
public class DiagnosticCenter {
	@Id
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "contact")
	private String contactNo;
	@Column(name = "address")
	private String address;
	@Column(name = "contact_email")
	private String contactEmail;
	@Column
	private List<String> servicesOffered;
	@ManyToMany(targetEntity = DiagnosticTest.class)
	private Set<DiagnosticTest> tests;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public List<String> getServicesOffered() {
		return servicesOffered;
	}

	public void setServicesOffered(List<String> servicesOffered) {
		this.servicesOffered = servicesOffered;
	}

	public Set<DiagnosticTest> getTests() {
		return tests;
	}

	public void setTests(Set<DiagnosticTest> tests) {
		this.tests = tests;
	}

}