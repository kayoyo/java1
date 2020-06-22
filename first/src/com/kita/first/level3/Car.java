package com.kita.first.level3;

public class Car {

	String name;
	String color;
	int cc;
	
	public Car( ) {
		this("소나타","흰색", 2500);
	}

	public Car(String name) { // String name을 받아와서 이름이 달라지면 색상과 cc출력
		this(name, "검정색", 3000);
	}
	
	

	public Car(String name, String color, int cc) { // 생성자
		// 전역변수 이름은 지역변수 이름 사용 가능하나 지역변수 이름은 지역변수에서 사용안됨
		// super(); 위에는 변수나 코드를 적을 수 없다.

		super(); //super는 직속 부모를 가르킴
		this.name = name; // this 나의 객체 주소값 
		this.color = color;
		this.cc = cc;
	}

	public void introduceMyCar() {
		
		System.out.printf("%s의 컬러는 %s이고 %d이다\n", name, color, cc);
	}

}
