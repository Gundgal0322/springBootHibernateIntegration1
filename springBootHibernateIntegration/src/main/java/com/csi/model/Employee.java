package com.csi.model;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@javax.persistence.Entity
public class Employee {

	@Id
	@GeneratedValue
	
	private int empId;
	private String empName;
	private double empSalary;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date empDOB;

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public Date getEmpDOB() {
		return empDOB;
	}


	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}
	
	
}
