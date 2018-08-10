package com.aman.ui;

import java.util.List;
import java.util.Scanner;

import com.aman.dto.Employee;
import com.aman.exception.AgeException;
import com.aman.service.EmployeeService;

public class EmployeeMain {
	static Scanner sc = new Scanner(System.in);
	static EmployeeService empService = new EmployeeService();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 0;
		do {
			menu();
			System.out.println("Enter a Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addEmployee();
				break;
			case 2:
				searchEmployee();
				break;
			case 3:
				deleteEmployee();
				break;
			case 4:
				modifyEmployee();
				break;
			case 5:
				showAllEmployee();
				break;
			case 6:
				System.out.println("Exiting Applicatin~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.exit(0);
				break;

			default:
				System.out.println("Enter Correct Choice");
				break;
			}

		} while (choice != 6);

	}

	private static void showAllEmployee() {
		// TODO Auto-generated method stub

		List<Employee> empdetails = empService.showAllEmployee();
		for (Employee employee : empdetails) {
			
			System.out.println("Name: " + employee.getEmpName());
			System.out.println("ID: " + employee.getEmpId());
			System.out.println("Age: " + employee.getAge());
			System.out.println("Salary " + employee.getSalary() + "\n");

		}

	}

	private static void modifyEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID:");
		int empId = sc.nextInt();
		Employee serachData = empService.searchEmployee(empId);
		if (serachData == null) {
			System.out.println("No employee Found");
		} else {
			System.out.println("Enter Employee Name:");
			String empName = sc.next();

			System.out.println("Enter Employee Age");
			int age = sc.nextInt();

			System.out.println("Enter Salary");
			double salary = sc.nextDouble();

			Employee employee = new Employee();// create inside add method
			try {
				employee.setAge(age);
				employee.setEmpId(empId);
				employee.setEmpName(empName);
				employee.setSalary(salary);
				empService.modifyEmployee(empId, employee);
			} catch (AgeException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			
			
		}

	}

	private static void deleteEmployee() {
		// TODO Auto-generated method stub

		System.out.println("Enter Employee ID:");
		int empId = sc.nextInt();
		empService.deleteEmployee(empId);

	}

	private static void searchEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID:");
		int empId = sc.nextInt();
		Employee serachData = empService.searchEmployee(empId);

		if (serachData == null) {
			System.out.println("บบบบบบบบบบบบบบบบบบบบบบบบบบบNO SUCH EMPLOYEE FOUNDบบบบบบบบบบบบบบบบบบบบบบบบบบบ\n");

		} else {
			
			System.out.println("\nName: " + serachData.getEmpName());
			System.out.println("ID: " + serachData.getEmpId());
			System.out.println("Age: " + serachData.getAge());
			System.out.println("Salary " + serachData.getSalary()+"\n");
		}

	}

	private static void addEmployee() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int empId;
		String empName;
		int age;
		double salary;

		System.out.println("Enter Employee ID:");
		empId = sc.nextInt();

		System.out.println("Enter Employee Name:");
		empName = sc.next();

		System.out.println("Enter Employee Age");
		age = sc.nextInt();

		System.out.println("Enter Salary");
		salary = sc.nextDouble();

		Employee employee = new Employee();// create inside add method
		try {
			employee.setAge(age);
			employee.setEmpId(empId);
			employee.setEmpName(empName);
			employee.setSalary(salary);

			empService.addEmployee(employee);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		

	}

	private static void menu() {
		// TODO Auto-generated method stub

		System.out.println("Employee Management System\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("1. Add Employee\n2. Search Employee\n3. Delete Employee\n4. Modify Employee"
				+ "\n5. Show all Employee\n6. Exit\n");

	}

}
