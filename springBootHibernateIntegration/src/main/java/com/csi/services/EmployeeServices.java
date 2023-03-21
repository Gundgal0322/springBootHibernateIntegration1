package com.csi.services;

import java.util.List;

import com.csi.model.Employee;


public interface EmployeeServices {
	
	public void saveData(Employee employee);
	
	public List<Employee> getAllData();

}
