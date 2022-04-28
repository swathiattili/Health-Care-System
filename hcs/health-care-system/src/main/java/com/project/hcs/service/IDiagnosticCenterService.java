package com.project.hcs.service;

import java.util.List;


import com.project.hcs.entities.DiagnosticCenter;
import com.project.hcs.entities.DiagnosticTest;
import com.project.hcs.entities.Appointment;

public interface IDiagnosticCenterService {
	public List<DiagnosticCenter> getAllDiagnosticCenters();

	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter center);

	public DiagnosticCenter getDiagnosticCenter(int diagnosticCenterId);

	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);

	public DiagnosticTest viewTestDetails(int diagnosticCenterId, String testName);

	public DiagnosticTest addTest(int diagnosticCenterId, int testId);

	public DiagnosticCenter getDiagnosticCenter(String centerName);

	public DiagnosticCenter removeDiagnosticeCenter(int id);

	public List<Appointment> getListOfAppointments(String centerName);


}
