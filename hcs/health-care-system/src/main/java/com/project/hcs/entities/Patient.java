package com.project.hcs.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	private int patientid;
	@Column(name = "name")
	private String name;
	@Column(name = "phoneNo")
	private String phoneNo;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;

	//@OneToOne(cascade = CascadeType.ALL)
	//private Appointment appointments;

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/*public Appointment getAppointments() {
		return appointments;
	}

	public void setAppointments(Appointment appointments) {
		this.appointments = appointments;
	}*/

}
