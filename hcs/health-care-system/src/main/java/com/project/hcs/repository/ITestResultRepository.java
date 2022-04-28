package com.project.hcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.hcs.entities.DiagnosticTest;
import com.project.hcs.entities.TestResult;

@Repository
public interface ITestResultRepository extends JpaRepository<TestResult, Integer> {
	@Query(value = "select test from TestResult test where test.criteria=?1")
	public List<DiagnosticTest> findByCondition(String criteria);

}
