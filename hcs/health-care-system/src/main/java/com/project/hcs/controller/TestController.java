package com.project.hcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.hcs.entities.DiagnosticTest;
import com.project.hcs.service.ITestService;

public class TestController {
	@Autowired
	ITestService service;

	@PostMapping("/addDiagnosticTest")
	public ResponseEntity<String> addNewTest(@RequestBody DiagnosticTest diagnosticTest) {

		service.addTest(diagnosticTest);

		return new ResponseEntity<String>("Test saved successfully !", HttpStatus.CREATED);
	}

	@PutMapping("/updateTestDetail/{id}")
	public ResponseEntity<DiagnosticTest> updateTestDetail(@RequestBody DiagnosticTest diagnosticTest) {

		return new ResponseEntity<>(service.updateTest(diagnosticTest), HttpStatus.OK);
	}

	@DeleteMapping("/deleteDiagnosticTest/{id}")
	public ResponseEntity<String> deleteDiagnosticTest(@RequestBody DiagnosticTest test) {

		service.removeTest(test);

		return new ResponseEntity<String>("Test deleted successfully !", HttpStatus.OK);
	}

	@GetMapping("/allTest")
	public List<DiagnosticTest> viewAllTest() {
		String id = null;
		return service.viewAllTest(id);
	}

}
