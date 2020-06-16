package com.kita.first;

public class Operator5 {

	public static void main(String[] args) {
//		비교 연산자 > boolean 두개만 비교 가능
		int n1 = 10;
		int n2 = 11;
		boolean result = (n1 == n2);  
		System.out.println(n1 == n2); //'=='두 값이 같으면 true 아니면 false 
		System.out.println(n1);
		
		System.out.println(); 
		result = (n1 != n2); //'!=' 두 값이 다르면 true 아니면 false
		System.out.println(result); //result 앞에 '!'가 붙으면 결과가 반대값
		System.out.println(n1 !=n2);
		
		System.out.println();
		result = n1 >= n2;
		System.out.println("n1 > n2 : " + result);
		result = n1 <= n2;
		System.out.println("n1 > n2 : " + result);
		
		
	}
}
