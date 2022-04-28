package com.project.hcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hcs.entities.Patient;

import com.project.hcs.service.IPatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	IPatientService dao;

	@PutMapping("/updateTestDetail")
	public ResponseEntity<String> updatePatientDetail(@RequestBody Patient patient) {
		dao.updatePatientDetails(patient);
		return new ResponseEntity<>("Patient data is Updated", HttpStatus.OK);
	}

	@GetMapping("/viewPatient{patientUserName}")
	public ResponseEntity<Patient> viewPatient(@PathVariable String patientUserName) {
		Patient pt = dao.viewPatient(patientUserName);
		return new ResponseEntity<Patient>(pt, HttpStatus.OK);
	}

	@PostMapping("/registerPatient")
	public ResponseEntity<String> registerPatient(@RequestBody Patient patient) {
		dao.registerPatient(patient);
		return new ResponseEntity<String>("The Patient is Registered", HttpStatus.OK);
	}

}
