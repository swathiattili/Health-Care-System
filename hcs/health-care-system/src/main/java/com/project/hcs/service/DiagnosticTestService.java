package com.project.hcs.service;

import java.util.List;

import com.project.hcs.entities.DiagnosticTest;

public interface DiagnosticTestService {

	public List<DiagnosticTest> getAllTest();

	public DiagnosticTest addNewTest(DiagnosticTest test);

	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId);

	public DiagnosticTest updateTestDetail(DiagnosticTest test);

	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test);

}
