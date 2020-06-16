package com.kita.first;

public class Operator7 {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println(n1 == n2 && n1 == n3 && n2 == n3 ); //&& 양쪽 모두 true 이어야 true 
		System.out.println(n1 == n2 || n1 == n3 || n2 == n3 ); //|| 어느 한쪽만 true 이면 true
	}
}
