package com.aman.dto;

import com.aman.exception.AgeException;

public class Employee {
	private int empId;
	private String empName;
	private int age;
	private double salary;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age > 18) {
			this.age = age;
		} else {
			throw new AgeException("Invalid age");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
