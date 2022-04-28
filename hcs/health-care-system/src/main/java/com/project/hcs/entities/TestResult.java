package com.project.hcs.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "test_result")
public class TestResult {
	@Id
	private int id;
	@Column(name = "testreading")
	private double testReading;
	@Column(name = "condition")
	private String condition;
	@OneToMany(mappedBy = "Appointment", cascade = CascadeType.ALL)
	private Set<TestResult> TestResult;
	@Column(name = "appointment")
	private Appointment appointment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTestReading() {
		return testReading;
	}

	public void setTestReading(double testReading) {
		this.testReading = testReading;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Set<TestResult> getTestResult() {
		return TestResult;
	}

	public void setTestResult(Set<TestResult> testResult) {
		TestResult = testResult;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

}
