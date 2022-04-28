package com.project.hcs.service;

import java.util.Optional;

import com.project.hcs.entities.Patient;
import com.project.hcs.entities.TestResult;

public interface ITestResultService {

	public TestResult addTestResult(TestResult testResult);

	public TestResult updateResult(TestResult testResult);

	public TestResult removeTestResult(int testId);

	public Optional<TestResult> viewResultsByPatient(Patient patient);

}