package com.aman.dao;

import java.util.List;

import com.aman.dto.Employee;
import com.aman.exception.AgeException;
import com.aman.staticdb.StaticDB;

public class EmployeeDao implements IEmployeeDao{
	
	StaticDB empdb= new StaticDB();
	List<Employee> employeedb= empdb.mylist;
	
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		employeedb.add(employee);
		System.out.println("บบบบบบบบบบบบบบบบบบบบบบบบบบบ EMPLOYEE ADDED SUCESSFULLY บบบบบบบบบบบบบบบบบบบบบบบบบบบ\n");
	
		
	}

	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee search =null;
		
		for (Employee employee : employeedb) {
			
			if(empId==employee.getEmpId())
			{
				search =employee;
				break;
			}
			
		}
		
		
		return search;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
		int flag=0;
		for (Employee employee : employeedb) {
			
			if(empId==employee.getEmpId())
			{
				
				employeedb.remove(employee);
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("No employee FOund: ");
		}
		else
		{
			System.out.println("Employee Deleted: ");
		}
	}

	@Override
	public void modifyEmployee(int empID, Employee employ) {
		// TODO Auto-generated method stub
		
		for (Employee employee : employeedb) {
			
			try {
				employee.setAge(employ.getAge());
				employee.setEmpName(employ.getEmpName());
				employee.setSalary(employ.getSalary());
				System.out.println("บบบบบบบบบบบบบบบบบบบบบบบบบบบ EMPLOYEE DETAILS UPDATED บบบบบบบบบบบบบบบบบบบบบบบบบบบ\\n");
				
			} catch (AgeException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return employeedb;
	}

}
