package com.project.hcs.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//import com.project.springboot.hcs.model.DiagnosticCenter;
@Entity
@Table(name = "dignostictest")
public class DiagnosticTest {
	@Id
	private int id;
	@Column(name = "testname")
	private String testName;
	@Column(name = "testprice")
	private double testPrice;
	@Column(name = "normalvalue")
	private String normalValue;
	@Column(name = "units")
	private String units;
	@ManyToMany(targetEntity = DiagnosticCenter.class)
	Set<DiagnosticCenter> diagnosticCenters;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public double getTestPrice() {
		return testPrice;
	}

	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}

	public String getNormalValue() {
		return normalValue;
	}

	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Set<DiagnosticCenter> getDiagnosticCenters() {
		return diagnosticCenters;
	}

	public void setDiagnosticCenters(Set<DiagnosticCenter> diagnosticCenters) {
		this.diagnosticCenters = diagnosticCenters;
	}

}
