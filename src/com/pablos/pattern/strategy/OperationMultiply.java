package com.pablos.pattern.strategy;

public class OperationMultiply implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a * b;
	}

}