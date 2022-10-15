package com.operators;

public class InstanceOfOperator {
	public static void main(String[] args) {
		
		String s1  = "Byte Brains";
		
		InstanceOfOperator obj = new InstanceOfOperator();
		obj.abc(s1);
		
	}
	public void abc(String s1) {		
		if(s1 instanceof String) {
			System.out.println(s1);
		}
		
	}
}











