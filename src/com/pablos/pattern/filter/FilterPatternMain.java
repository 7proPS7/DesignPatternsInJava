package com.pablos.pattern.filter;

import java.util.ArrayList;

public class FilterPatternMain {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Pawel", "male", "single", 22));
		persons.add(new Person("Rafal", "male", "single", 17));
		persons.add(new Person("Leia", "female", "married", 24));
		persons.add(new Person("Loren", "female", "single", 16));
		persons.add(new Person("Michael", "male", "married", 29));
		persons.add(new Person("Aga", "female", "single", 18));

		Criteria male = new MaleCriteria();
		Criteria female = new FemaleCriteria();
		Criteria single = new SingleCriteria();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);
		Criteria age = new AgeCriteria();

		System.out.println("Males: ");
		showPersons(male.meetCriteria(persons));

		System.out.println("\nFemale: ");
		showPersons(female.meetCriteria(persons));

		System.out.println("\nSingle Males");
		showPersons(singleMale.meetCriteria(persons));

		System.out.println("\nSingle or Females");
		showPersons(singleOrFemale.meetCriteria(persons));

		System.out.println("\nAge ");
		showPersons(age.meetCriteria(persons));
	}

	public static void showPersons(ArrayList<Person> persons) {
		for (Person person : persons)
			System.out.println("Person: [ Name: " + person.getName() + ", Gender: " + person.getGender()
					+ ", Maritial Status: " + person.getMaritalStatus() + ", Age: " + person.getAge() + " ]");
	}

}
