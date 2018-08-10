package com.aman.service;

import java.util.List;

import com.aman.dao.EmployeeDao;
import com.aman.dto.Employee;

public class EmployeeService implements IEmployeeService {
	EmployeeDao empDao = new EmployeeDao();

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		empDao.addEmployee(employee);

	}

	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return empDao.searchEmployee(empId);

	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		empDao.deleteEmployee(empId);
	}

	@Override
	public void modifyEmployee(int empID, Employee employee) {
		// TODO Auto-generated method stub
		empDao.modifyEmployee(empID, employee);
	}

	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return empDao.showAllEmployee();

	}

}
