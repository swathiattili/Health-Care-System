package com.project.hcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hcs.entities.TestResult;
import com.project.hcs.service.ITestResultService;

@RestController
@RequestMapping("/testresult")
public class TestResultController {

	@Autowired
	ITestResultService dao;

	@PostMapping("/addTestResult")
	public ResponseEntity<String> addTestResult(@RequestBody TestResult testResult) {

		dao.addTestResult(testResult);

		return new ResponseEntity<String>("Test Result saved successfully !", HttpStatus.CREATED);
	}

	@PutMapping("/updateTestResult/{id}")
	public ResponseEntity<String> updateResult(@RequestBody TestResult testResult) {
		dao.updateResult(testResult);
		return new ResponseEntity<String>("Test Result is Updated", HttpStatus.OK);
	}

	@DeleteMapping("/deleteTestResult/{id}")
	public ResponseEntity<String> deleteTestResult(@PathVariable Integer id) {

		dao.removeTestResult(id);

		return new ResponseEntity<String>("Test Result deleted successfully !", HttpStatus.OK);
	}
}