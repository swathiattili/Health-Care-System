package com.project.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hcs.entities.DiagnosticTest;

import com.project.hcs.repository.ITestResultRepository;

@Service
public class TestServiceImpl implements ITestService {

	@Autowired
	ITestResultRepository dao;

	@Override
	public DiagnosticTest updateTest(DiagnosticTest diagnosticTest) {

		return diagnosticTest;
		// return ts.save(diagnosticTest);

	}

	@Override
	public List<DiagnosticTest> viewAllTest(String criteria) {
		List<DiagnosticTest> dt = dao.findByCondition(criteria);
		return dt;
	}

	@Override
	public DiagnosticTest removeTest(DiagnosticTest test) {
		dao.deleteById(test.getId());
		return test;
	}

	@Override
	public DiagnosticTest addTest(DiagnosticTest test) {
		// dao.save(test)
		return test;
	}

}
