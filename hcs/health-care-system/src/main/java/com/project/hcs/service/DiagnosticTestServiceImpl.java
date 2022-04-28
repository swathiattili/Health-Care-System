package com.project.hcs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hcs.entities.DiagnosticCenter;
import com.project.hcs.entities.DiagnosticTest;
import com.project.hcs.repository.IDiagnosticCenterRepository;
import com.project.hcs.repository.IDiagnosticTestRepository;

@Service
public class DiagnosticTestServiceImpl implements DiagnosticTestService {

	@Autowired
	IDiagnosticTestRepository dao;

	@Autowired
	IDiagnosticCenterRepository centerDao;

	public DiagnosticTest addNewTest(DiagnosticTest test) {
		Optional<DiagnosticTest> checkDiagnosticTest = dao.findById(test.getId());
		if (checkDiagnosticTest.isEmpty()) {
			dao.save(test);
		}
		return test;
	}

	@Override
	public List<DiagnosticTest> getTestsOfDiagnosticCenter(int centerId) {

		List<DiagnosticTest> tests = dao.findAll();
		DiagnosticCenter center = centerDao.findById(centerId).get();
		List<DiagnosticTest> centerSpecific = new ArrayList<DiagnosticTest>();
		for (DiagnosticTest test : tests) {
			if (test.getDiagnosticCenters().contains(center))
				centerSpecific.add(test);
		}
		return centerSpecific;
	}

	@Override
	public List<DiagnosticTest> getAllTest() {
		List<DiagnosticTest> allTest = new ArrayList<>();
		dao.findAll().forEach(test -> allTest.add(test));
		return allTest;
	}

	@Override
	public DiagnosticTest updateTestDetail(DiagnosticTest test) {
		Optional<DiagnosticTest> DiagnosticTestById = dao.findById(test.getId());
		DiagnosticTest diagnosticTest = DiagnosticTestById.get();

		diagnosticTest.setTestName(test.getTestName());
		diagnosticTest.setTestPrice(test.getTestPrice());
		diagnosticTest.setNormalValue(test.getNormalValue());
		diagnosticTest.setUnits(test.getUnits());

		return dao.save(diagnosticTest);

	}

	@Override
	public DiagnosticTest removeTestFromDiagnosticCenter(int centerId, DiagnosticTest test) {
		Optional<DiagnosticTest> check = dao.findById(centerId);
		DiagnosticTest diagnosticTest;
		if (!check.isEmpty()) {
			diagnosticTest = check.get();
			dao.delete(diagnosticTest);
		}
		return test;
	}

}
