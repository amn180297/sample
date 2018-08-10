package com.aman.staticdb;

import java.util.ArrayList;
import java.util.List;
import com.aman.dto.*;

public class StaticDB {
	public static List<Employee> mylist = null;

	static {
		mylist = new ArrayList<>();
	}

	public static List<Employee> databaseEmployee() {
		return mylist;
	}
}
