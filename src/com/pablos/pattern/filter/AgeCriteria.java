package com.pablos.pattern.filter;

import java.util.ArrayList;

public class AgeCriteria implements Criteria {

	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		ArrayList<Person> agePerson = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getAge()>=18 && person.getGender().equalsIgnoreCase("FEMALE"))
				agePerson.add(person);
			else if(person.getAge()>=21 && person.getGender().equalsIgnoreCase("MALE"))
				agePerson.add(person);
		}
		return agePerson;
	}

}
