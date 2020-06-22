package com.kita.first.level3;

public class Monitor { //멤버 필드를 사용안하고 파라미터만 사용한다면 무조건 static을 붙일 것
	static String brand; //클래스 변수
	int inch; //인스턴스 변수
	
	void printInfo() {
		System.out.printf("brand: %s, inch : %d\n", this.brand, this.inch);
	}

	void printInch() {
		System.out.println(brand);
		System.out.println(inch);
	}
	
	static void printBrand() {
		System.out.println(brand);
	}
}
		
	
	
	//static이 안 붙은 변수는 객체화 하여 사용 가능함.  


