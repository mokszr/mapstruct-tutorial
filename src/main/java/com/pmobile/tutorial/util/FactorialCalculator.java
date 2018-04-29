package com.pmobile.tutorial.util;

public class FactorialCalculator {

	private static final long BASE_FACTORIAL_VALUE = 1L;
	private static final long FACTORIAL_CALCULATION_LIMIT = 0L;

	public Long calculate(long askedFactorial) {
		Long factorial = BASE_FACTORIAL_VALUE;
		for(long i = askedFactorial; i > FACTORIAL_CALCULATION_LIMIT; i--){
			factorial *= i;
		}
		
		return factorial;
	}

}
