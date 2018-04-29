package com.pmobile.tutorial.util;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FactorialCalculatorTest {

	private FactorialCalculator factorialCalculator = new FactorialCalculator();
	
	@Test public void
	calculateZeroFactorial(){
		Long zeroFactorial = factorialCalculator.calculate(0);
		assertThat(zeroFactorial, equalTo(1L));	
	}
	
	@Test public void
	calculateOneFactorial(){
		Long oneFactorial = factorialCalculator.calculate(1L);
		assertThat(oneFactorial, equalTo(1L));		
	}
	
	@Test public void
	calculateTwoFactorial(){
		Long twoFactorial = factorialCalculator.calculate(2L);
		assertThat(twoFactorial, equalTo(2L));		
	}
	
	@Test public void
	calculateThreeFactorial(){
		Long threeFactorial = factorialCalculator.calculate(3L);
		assertThat(threeFactorial, equalTo(6L));		
	}
	
	@Test public void
	calculateFiveFactorial(){
		Long fiveFactorial = factorialCalculator.calculate(5L);
		assertThat(fiveFactorial, equalTo(120L));		
	}
	
	@Test public void
	calculateTenFactorial(){
		Long tenFactorial = factorialCalculator.calculate(10L);
		assertThat(tenFactorial, equalTo(3628800L));		
	}
	
	@Test public void
	calculate13Factorial(){
		Long _13Factorial = factorialCalculator.calculate(13L);
		assertThat(_13Factorial, equalTo(6227020800L));		
	}
	

	@Test public void
	calculate15Factorial(){
		Long _15Factorial = factorialCalculator.calculate(15L);
		assertThat(_15Factorial, equalTo(1307674368000L));		
	}
	

	@Test public void
	calculate20Factorial(){
		Long _20Factorial = factorialCalculator.calculate(20L);
		assertThat(_20Factorial, equalTo(2432902008176640000L));		
	}

}
