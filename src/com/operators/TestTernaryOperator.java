package com.operators;

public class TestTernaryOperator {
	public static void main(String[] args) {
		int a = 150;
		int b = 100;
		int abc;
		if (a != b) {   // False
			abc = a;
		} else {      //  True
			abc = b;
		}
		System.out.println("Test Ternary Example "
				+ ": "+abc);  
	}
}
