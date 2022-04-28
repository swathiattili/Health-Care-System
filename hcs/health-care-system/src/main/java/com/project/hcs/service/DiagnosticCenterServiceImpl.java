package com.project.hcs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.hcs.entities.DiagnosticCenter;
import com.project.hcs.entities.DiagnosticTest;
import com.project.hcs.repository.*;
import com.project.hcs.repository.IDiagnosticTestRepository;

import com.project.hcs.entities.Appointment;

public class DiagnosticCenterServiceImpl implements IDiagnosticCenterService {

	@Autowired
	IDiagnosticCenterRepository dao;

	@Autowired
	IDiagnosticTestRepository testDao;

	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() {
		return dao.findAll();
	}

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter center) {
		dao.save(center);
		return center;
	}

	@Override
	public DiagnosticCenter getDiagnosticCenter(int diagnosticCenterId) {
		Optional<DiagnosticCenter> center = dao.findById(diagnosticCenterId);
		return center.get();
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		dao.save(diagnosticCenter);
		return diagnosticCenter;
	}

	@Override
	public DiagnosticTest viewTestDetails(int diagnosticCenterId, String testName) {
		return null;
	}

	@Override
	public DiagnosticTest addTest(int diagnosticCenterId, int testId) {
		DiagnosticCenter center = dao.findById(diagnosticCenterId).get();
		center.getTests().add(testDao.findById(testId).get());
		return testDao.findById(testId).get();
	}

	@Override
	public DiagnosticCenter getDiagnosticCenter(String centerName) {
		List<DiagnosticCenter> centers = dao.findAll();
		for (DiagnosticCenter center : centers) {
			if (center.getName().equals(centerName))
				return center;
		}
		return null;
	}

	@Override
	public DiagnosticCenter removeDiagnosticeCenter(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getListOfAppointments(String centerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
