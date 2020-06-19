package com.kita.first.repeatlevel2;

public class Method4 {

	public static void main(String[] args) {
		
		sum(4, 5);
		sum(5, 7, 9);
		sum(1, 2, 3, 4);
		sum(1, 2, 3, 4, 5);
		
}

	/*public static void sum(int a, int...arr) {
		// 첫 숫자만 들어감, 4/5/1
	}*/
	
	public static void sum(int...arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum: " + sum);
	}	
}
