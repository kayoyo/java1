package com.kita.first;

public class If {

	public static void main(String[] args) {
		int n1 = 30;
		int n2 = 10;
		
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다");
		} else if(n1 == n2) {
			System.out.println("n1이 n2이 같다");  
		} else {
			System.out.println("n1이 n2보다 크지 않다");
		}   System.out.println("끝");
	}
}
