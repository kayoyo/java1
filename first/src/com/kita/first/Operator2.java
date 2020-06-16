package com.kita.first;

public class Operator2 {
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		
		int result = n1++; //++이 뒤에 있으면 원래 값을 복사하여 값을 준다.
		System.out.println("result: " + result);
		System.out.println("n1: " +  n1);
		
		int result2 = ++n2;
		System.out.println("result2: " + result2);
		System.out.println("n2: " +  n2);

		
	}

}
