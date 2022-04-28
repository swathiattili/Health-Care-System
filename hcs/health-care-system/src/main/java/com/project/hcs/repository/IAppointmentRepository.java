package com.project.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hcs.entities.Appointment;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {

}
