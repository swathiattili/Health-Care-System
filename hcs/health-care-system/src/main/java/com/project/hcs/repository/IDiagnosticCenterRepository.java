package com.project.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hcs.entities.DiagnosticCenter;

@Repository
public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, Integer> {

}
