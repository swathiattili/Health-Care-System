package com.project.hcs.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hcs.entities.Appointment;

import com.project.hcs.repository.IAppointmentRepository;

@Service
public class AppointmentServiceImpl implements IAppointmentService {
	@Autowired
	IAppointmentRepository dao;

	@Override
	public Appointment addAppointment(Appointment appointment) {
		dao.save(appointment);
		return appointment;
	}

	@Override
	public Appointment viewAppointment(int appointmentId) {
		Optional<Appointment> ap = dao.findById(appointmentId);
		return ap.get();
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		dao.save(appointment);
		return appointment;
	}

	@Override
	public List<Appointment> getAppointmentList(int centreId, String test, int status) {
		// dao.findById(appointment);
		return null;
	}

	@Override
	public Appointment removeAppointment(Appointment appointment) {
		dao.deleteById(appointment.getId());
		return appointment;
	}

	@Override
	public Set<Appointment> viewAppointments(String patientName) {

		return null;
	}

}
