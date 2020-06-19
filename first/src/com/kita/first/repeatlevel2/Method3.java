package com.kita.first.repeatlevel2;

public class Method3 {

	public static void main(String[] args) {
		//String result = sum(30, 10);
		int result = sum(15, 10); //메소드 앞에 "=" 무조건 비보이드형
		System.out.println(result); 
		
		result = minus(30,20);
		System.out.println(result); 
		
	}
	
	
	public static int sum(int n1, int n2) {
		// 결과값을 받고 싶으면 비보드형 무조건 return 코드가 있어야 함
		// public static String sum(int n1, int n2) 
		// return n1+n2+"" ; > > 계산은 왼쪽에서 부터 >>> int result의 값은 40""
		  return n1+n2;
		// n1=15, n2=10 값을 더하고 return >> int result 값은 25
		// return 값에 따라 출력됨 예) return=0 이면 0, return=10 10, return n1; >> 15
		// if문이나 for문을 넣을경우 반드시 return을 반드시 만나게 할 것 
	}
	
	public static int minus(int n1, int n2) {
		if(n1 > 10) {
			return n1 - n2;	
		}
		return 0;
	}

}

