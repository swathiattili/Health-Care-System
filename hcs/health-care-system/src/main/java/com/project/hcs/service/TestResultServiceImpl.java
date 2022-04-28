package com.project.hcs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hcs.entities.Patient;
import com.project.hcs.entities.TestResult;
import com.project.hcs.repository.ITestResultRepository;

@Service
public class TestResultServiceImpl implements ITestResultService {
	@Autowired
	ITestResultRepository dao;

	@Override
	public TestResult addTestResult(TestResult testResult) {
		dao.save(testResult);
		return testResult;
	}

	@Override
	public TestResult updateResult(TestResult testResult) {
		dao.save(testResult);
		return testResult;
	}

	@Override
	public TestResult removeTestResult(int testId) {
		dao.deleteById(testId);
		return removeTestResult(testId);
	}

	@Override
	public Optional<TestResult> viewResultsByPatient(Patient patient) {
		Optional<TestResult> set = dao.findById(patient.getPatientid());
		return set;
	}

}
