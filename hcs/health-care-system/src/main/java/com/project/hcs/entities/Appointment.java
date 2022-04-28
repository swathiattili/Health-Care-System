package com.project.hcs.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id
	private int id;
	@Column(name = "appointmentDate")
	private LocalDate appointmentDate;
	@Column(name = "approvalStatus")
	private ApprovalStatus approvalStatus;

	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;

	@OneToMany(targetEntity = DiagnosticTest.class, cascade = CascadeType.ALL)
	private DiagnosticTest diagonsticTests;

	@OneToOne(targetEntity = DiagnosticCenter.class, cascade = CascadeType.ALL)
	private DiagnosticCenter diagnosticCenter;

	@OneToMany(targetEntity = TestResult.class, cascade = CascadeType.ALL)
	private Set<TestResult> testResult;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public ApprovalStatus getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(ApprovalStatus approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public DiagnosticTest getDiagonsticTests() {
		return diagonsticTests;
	}

	public void setDiagonsticTests(DiagnosticTest diagonsticTests) {
		this.diagonsticTests = diagonsticTests;
	}

	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public Set<TestResult> getTestResult() {
		return testResult;
	}

	public void setTestResult(Set<TestResult> testResult) {
		this.testResult = testResult;
	}

}
