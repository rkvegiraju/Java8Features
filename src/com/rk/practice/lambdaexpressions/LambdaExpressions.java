package com.rk.practice.lambdaexpressions;

public class LambdaExpressions {

	public static void main(String[] args) {
		// Anonymous Interfaces with Lambda Expressions
		//Interface1 i1 = (s, i) -> System.out.println(s + " " + i);
		Interface1 i1 = (s, i) -> {
			System.out.println(s + " " + i);
			System.out.println(s + " " + i);
		};
		
		i1.methodWithMoreArgs("RK", 1);
	}
}
