package com.kita.first.level3;

public class CarTest {

	
	public static void main(String[ ] args) {
		
		// Car car = new Car(); == public Car()
		// 생성자 : 이름이 클래스명이랑 똑같다. return 값이 없다.
		// 오버로딩 가능(여러개의 생성자를 만들 수 있다.)
		//멤버 필드는 무조건 프라이빗 
		Car car = new Car(); //기본 생성자 호출
		Car car1 = new Car("그랜저", "검정색", 3000); //파라미터가 있는 생성자 호출
		Car car2 = new Car("그랜저");
		Car car3 = new Car("G80");
	
		
		car.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
		
		
		
		
		
		
	    
	}
}
