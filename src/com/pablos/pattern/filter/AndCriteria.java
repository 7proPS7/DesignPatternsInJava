package com.pablos.pattern.filter;

import java.util.ArrayList;

public class AndCriteria implements Criteria{
	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
		
	}
	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		ArrayList<Person>firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
