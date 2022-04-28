package com.project.hcs.service;

import java.util.List;

import com.project.hcs.entities.Patient;
import com.project.hcs.entities.TestResult;

public interface IPatientService {
	public Patient registerPatient(Patient patient);

	public Patient updatePatientDetails(Patient patient);

	public Patient viewPatient(String patientUserName);

	public List<TestResult> getAllTestResult(String patientUserName);

	public TestResult viewTestResult(int testResultId);

}
