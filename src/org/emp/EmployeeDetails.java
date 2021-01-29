package org.emp;

import java.util.Scanner;

public class EmployeeDetails {
public static void main(String[] args) {
	Scanner emp = new Scanner(System.in);
	System.out.println("Employee Id       : ");
	int empId = emp.nextInt();
	System.out.println("Employee Name     : ");
	String empName = emp.next();
	System.out.println("Employee Email    : ");
	String empEmail = emp.next();
	System.out.println("Employee Phone no : ");
	long empPhoneno = emp.nextLong();
	System.out.println("Employee Salary   : ");
	float empSalary = emp.nextFloat();
	System.out.println("Employee Gender   : ");
	String empGender = emp.next();
	System.out.println("Employee City     : ");
	String empCity = emp.next();
	System.out.println("   Employee Details   ");
	System.out.println("-----------------------");
	System.out.println("Employee Id : " + empId);
	System.out.println("Employee Name : " + empName);
	System.out.println("Employee Email : " + empEmail);
	System.out.println("Employee Phone no : " + empPhoneno);
	System.out.println("Employee Salary : "  + empSalary);
	System.out.println("Employee Gender : " + empGender);
	System.out.println("Employee City : " + empCity);
}
}
