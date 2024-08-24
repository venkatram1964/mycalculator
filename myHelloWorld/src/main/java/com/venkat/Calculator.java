package com.venkat;

public class Calculator {	
	
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("b should not be zero");
			
		}
		return a / b;
	}
	
	public int substract(int a, int b) {
		return a - b;
	}

}
