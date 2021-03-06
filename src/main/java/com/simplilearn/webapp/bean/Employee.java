package com.simplilearn.webapp.bean;

public class Employee {
	
	// POJO class :: Plain Old Java Object class -> encapsulation.	
	private int empId;
	private String name;
	private String dept;
	private double salary;
	
	// constructor 
	public Employee(int empId, String name, String dept, double salary) {
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee() {	}

	// setter & getter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// override toString()
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}	
	
}
