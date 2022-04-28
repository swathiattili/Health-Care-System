package com.project.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hcs.entities.Patient;
import com.project.hcs.entities.TestResult;
import com.project.hcs.repository.IPatientRepository;

@Service
public class PatientServiceImpl implements IPatientService {
	@Autowired
	IPatientRepository dao;

	@Override
	public Patient registerPatient(Patient patient) {
		dao.save(patient);
		return patient;
	}

	@Override
	public Patient updatePatientDetails(Patient patient) {
		dao.save(patient);
		return patient;
	}

	@Override
	public Patient viewPatient(String patientUserName) {
		Patient pt = dao.findByName(patientUserName);
		return pt;
	}

	@Override
	public List<TestResult> getAllTestResult(String patientUserName) {
		//Patient p = dao.findByName(patientUserName);
		return null;
	}

	@Override
	public TestResult viewTestResult(int testResultId) {

		return null;
	}

}
