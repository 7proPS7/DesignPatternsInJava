package com.pablos.pattern.filter;

import java.util.ArrayList;

public class OrCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		ArrayList<Person> firstCriteriaItems=criteria.meetCriteria(persons);
		ArrayList<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		
		for(Person person: otherCriteriaItems ){
			if(!firstCriteriaItems.contains(person))
				firstCriteriaItems.add(person);
		}
		return firstCriteriaItems;
	}

}
