package com.pablos.pattern.strategy;

public class OperationSubstract implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a - b;
	}

}
