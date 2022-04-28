package com.project.hcs.service;

import java.util.List;
import java.util.Set;

import com.project.hcs.entities.Appointment;

public interface IAppointmentService {
	public Appointment addAppointment(Appointment appointment);

	public Set<Appointment> viewAppointments(String patientName);

	public Appointment viewAppointment(int appointment);

	public Appointment updateAppointment(Appointment appointment);

	public List<Appointment> getAppointmentList(int centreId, String test, int status);

	public Appointment removeAppointment(Appointment appointment);

}
