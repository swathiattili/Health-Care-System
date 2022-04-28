package com.project.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.hcs.entities.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {
	@Query(value = "select pt from Patient pt where pt.name=?1")
	public Patient findByName(String patientUserName);

	

}
