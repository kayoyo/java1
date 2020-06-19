package com.kita.first.level3;

public class CarTest {

	
	public static void main(String[ ] args) {
		
		// Car car = new Car(); == public Car()
		// 생성자 : 이름이 클래스명이랑 똑같다. return 값이 없다.
		// 오버로딩 가능(여러개의 생성자를 만들 수 있다.)
		Car car = new Car();
		Car car1 = new Car("그랜저", "검정색", 2500);
		
		car.introduceMyCar();
		car.name = "아반떼";
		
		
		
		car.introduceMyCar();
	    car1.introduceMyCar();
	}
}
