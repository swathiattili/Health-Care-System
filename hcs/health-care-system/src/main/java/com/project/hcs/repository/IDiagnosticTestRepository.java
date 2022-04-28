package com.project.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hcs.entities.DiagnosticTest;

@Repository
public interface IDiagnosticTestRepository extends JpaRepository<DiagnosticTest, Integer> {

}
