package com.project.hcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.hcs.entities.DiagnosticTest;
import com.project.hcs.service.DiagnosticTestService;

public class DiagnosticTestController {

	@Autowired
	DiagnosticTestService service;

	@PostMapping("/addDiagnosticTest")
	public ResponseEntity<String> addNewTest(@RequestBody DiagnosticTest diagnosticTest) {

		service.addNewTest(diagnosticTest);

		return new ResponseEntity<String>("Test saved successfully !", HttpStatus.CREATED);
	}

	@GetMapping("/TestsOfDiagnosticCenter/{id}")
	public ResponseEntity<List<DiagnosticTest>> getParkingPremiseUsingId(@PathVariable Integer id) {

		List<DiagnosticTest> DiagnosticTestById = service.getTestsOfDiagnosticCenter(id);
		return new ResponseEntity<>(DiagnosticTestById, HttpStatus.OK);
	}

	@GetMapping("/allTest")
	public List<DiagnosticTest> getAllTest() {
		return service.getAllTest();
	}

	@PutMapping("/updateTestDetail/{id}")
	public ResponseEntity<DiagnosticTest> updateTestDetail(@RequestBody DiagnosticTest diagnosticTest) {

		return new ResponseEntity<>(service.updateTestDetail(diagnosticTest), HttpStatus.OK);
	}

	@DeleteMapping("/deleteDiagnosticTest/{id}")
	public ResponseEntity<String> deleteDiagnosticTest(@PathVariable Integer id) {

		service.removeTestFromDiagnosticCenter(id, null);

		return new ResponseEntity<String>("Test deleted successfully !", HttpStatus.OK);
	}

}
