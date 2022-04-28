package com.project.hcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hcs.entities.Appointment;
import com.project.hcs.service.IAppointmentService;

@RestController
@RequestMapping("/application")
public class AppointmentController {
	@Autowired
	IAppointmentService dao;

	@PostMapping("/addAppointment")
	public ResponseEntity<String> addAppoint(@RequestBody Appointment appointment) {

		dao.addAppointment(appointment);

		return new ResponseEntity<>("Appointment saved successfully !", HttpStatus.CREATED);
	}

	@PutMapping("/updateAppointment")
	public ResponseEntity<String> updateAppoint(@RequestBody Appointment appointment) {
		dao.updateAppointment(appointment);
		return new ResponseEntity<String>("Appointment updated successfully!", HttpStatus.OK);
	}

	@DeleteMapping("/removeAppointment")
	public ResponseEntity<String> deleteAppoint(@RequestBody Appointment appointment) {

		dao.removeAppointment(appointment);

		return new ResponseEntity<String>("Appointment Result deleted successfully !", HttpStatus.OK);
	}
	
	@GetMapping("ViewByID/{id}")
	public ResponseEntity<Appointment> viewAppointmentsById(@PathVariable int id){
		Appointment ap = dao.viewAppointment(id);
		return new ResponseEntity<Appointment>(ap, HttpStatus.OK);
	}

}
