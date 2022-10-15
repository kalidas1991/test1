package com.operators;

public class LogicalOperatorEample {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		// 1st condition: to check a is greater than 10
		// 2nd condition: to check b is less than of 20

		// True AND True = True
		// True AND False = False
		// False AND True = False
		boolean c = (a > 3 && b < 20);
		System.out.println(c);
		
		// True OR True = True
		// True OR False = True
		// False OR True = True
		// False OR False = False
		boolean d = (a > 10 || b < 5);
		System.out.println(d);
		System.out.println(!d);

	}
}
