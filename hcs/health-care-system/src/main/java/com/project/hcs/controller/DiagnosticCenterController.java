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

import com.project.hcs.entities.DiagnosticCenter;
import com.project.hcs.entities.DiagnosticTest;
import com.project.hcs.service.IDiagnosticCenterService;

public class DiagnosticCenterController  {

	@Autowired
	IDiagnosticCenterService dao;

	
	@DeleteMapping("/deleteDiagnosticCenter/{id}")
	public ResponseEntity<String> deleteDiagnosticCenter(@PathVariable Integer id) {

		//dao.removeCenterFromDiagnosticCenter(id, null);

		return new ResponseEntity<String>("Center deleted successfully !", HttpStatus.OK);
	}

}
