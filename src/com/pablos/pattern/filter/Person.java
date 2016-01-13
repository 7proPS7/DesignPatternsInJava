package com.pablos.pattern.filter;

public class Person {
	private String name;
	private String gender;
	private String maritialStatus;
	private int age;

	public Person(String name, String gender, String maritialStatus, int age) {
		this.name = name;
		this.gender = gender;
		this.maritialStatus = maritialStatus;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritialStatus;
	}

	public int getAge() {
		return age;
	}

}
