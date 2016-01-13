package com.pablos.pattern.filter;

import java.util.ArrayList;

public class FemaleCriteria implements Criteria {

	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		ArrayList<Person> femalePerson = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("FEMALE"))
				femalePerson.add(person);
		}
		return femalePerson;
	}

}
