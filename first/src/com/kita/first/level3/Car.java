package com.kita.first.level3;

public class Car {

	String name;
	String color;
	int cc;

	public Car() { // 생성자에서는 생성자와 메소드 호출 가능함. 메소드에서는 생성자 호출 안됨
		this("소나타", "흰색", 2500);

	}

	public Car(String name, String color, int cc) { // 생성자
		// 전역변수 이름은 지역변수 이름 사용 가능하나 지역변수 이름은 지역변수에서 사용안됨

		super(); // super는 직속 부모를 가르킴
		this.name = name; // this 나의 객체 주소값 [주소값.name == car.name]
		this.color = color;
		this.cc = cc;
	}

	public void introduceMyCar() {
		System.out.printf("%의 컬러는 %s이고 %d이다.", name, color, cc);
	}

}
