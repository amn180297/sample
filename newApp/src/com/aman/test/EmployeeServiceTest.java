package com.aman.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aman.service.EmployeeService;

public class EmployeeServiceTest {

	
	EmployeeService service = new EmployeeService();
	
	@Test
	public void testSearchEmployee() {
		
		assertNull(service.searchEmployee(10));
	
	}

	@Test
	public void testShowAllEmployee() {
		
	}

}
