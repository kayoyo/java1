package com.kita.first;

public class PrintF {
	public static void main(String[] args) {
		int age = 33;
		String name = "정유정";
		float vision = 1.0f;
		char bloodType = 'A';
		
		System.out.println("나의 이름은" + name + "입니다. 나의 나이는" + age + "입니다." + "나의 시력은" + vision + "입니다. 나의 혈액형은" + bloodType + "입니다");
		System.out.printf("나의 이름은%s입니다. 나의 나이는 %d입니다. 나의 시력은 %.1f입니다. 나의 혈액형은 %c입니다.\n", name, age, vision, bloodType);
		
// 타입을 꼭 맞출 것, %s:문자열 %d:정수 %f:실수%c:문자, 천단위 숫자를 끊어서 표현시 %,d	
		
		char v1 = '0'; //A = 65
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		byte v2 = 57;
		System.out.printf("%c : %d\n", (char)v2, v2);
	
	
	
	}

}
