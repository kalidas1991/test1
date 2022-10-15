package com.operators;

public class UnaryOperatorExample {
	
	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("Postfix increment : ");
		System.out.println(a++);  // 5  --- // 6
		
		System.out.println("Postfix decrement : ");
		System.out.println(a--);  // 6  --- // 5

		System.out.println("Prefix decrement : ");
		System.out.println(--a);   // 4  ---- // 4
		
		System.out.println("Prefix increment : ");
		System.out.println(++a);  // 5  ---- // 5
	}

}
