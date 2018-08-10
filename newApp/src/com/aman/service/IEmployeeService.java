package com.aman.service;

import java.util.List;

import com.aman.dto.Employee;

public interface IEmployeeService {

	public void addEmployee(Employee employee);

	public Employee searchEmployee(int empId);

	public void deleteEmployee(int empId);

	public void modifyEmployee(int empID, Employee employee);

	public List<Employee> showAllEmployee();

}
