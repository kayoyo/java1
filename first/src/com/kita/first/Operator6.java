package com.kita.first;

public class Operator6 {
	public static void main(String[] args) {
		
		/*String str1 = "안녕";
		String str2 = "안녕";
		System.out.println(str1 == str2);
		true가 나오는 이유는 str2가 str1이 값이 되기 때문
		*/
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2); //'==' 문자열은 비교하면 안됨
		System.out.println(str1.equals(str2)); //레퍼런스 변수 값 비교는 equals를 통해서 해야함
		System.out.println("안녕1".equals(str1)); //equals뒤에 변수가 와야 안정됨 
		
		
	}
}
