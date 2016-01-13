package com.pablos.compositepattern;

import java.util.ArrayList;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private ArrayList<Employee> subordinates;

	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee emp) {
		subordinates.add(emp);
	}

	public void remove(Employee emp) {
		subordinates.remove(emp);
	}

	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return ("Employee:[Name : " + name + ", dept : " + dept + ", salary : " + salary + " ]");
	}

}
