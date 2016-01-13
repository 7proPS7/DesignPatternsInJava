package com.pablos.pattern.filter;

import java.util.ArrayList;

public class SingleCriteria implements Criteria {

	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		ArrayList<Person> meetPerson = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
				meetPerson.add(person);
		}
		return meetPerson;
	}

}
