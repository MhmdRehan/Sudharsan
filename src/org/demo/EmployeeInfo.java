package org.demo;

public class EmployeeInfo {

	//method1
	private void employeeName() { 
		System.out.println("Employee Name is raja");
	}
	
	//Method 2
	private void employeeAge() {
		System.out.println("Employee age is 23");
	}
	
	
	public static void main(String[] args) {
	//ClassName objref = new ClassName();	
	EmployeeInfo emp = new EmployeeInfo();	
	
	//method calling object.methodname
	emp.employeeAge();	
	emp.employeeName();	
	}

}
