package com.pablos.pattern.filter;

import java.util.ArrayList;

public class MaleCriteria implements Criteria {

	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		ArrayList<Person> malePerson = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE"))
				malePerson.add(person);
		}
		return malePerson;
	}

}
