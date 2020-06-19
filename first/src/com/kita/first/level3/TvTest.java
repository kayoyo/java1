package com.kita.first.level3;

public class TvTest {

	public static void main(String[] args) {
		//지역변수 일 때는 값을 넣어줘야 함. 예)Tv tv1;는 안됨 >> Tv tv1=null;
		Tv tv1 = new Tv(); 
		// 기본 생성자, 레퍼런스 타입이라 주소값만 저장하며, 반드시 Tv객체 주소값만 저장.  
		// 예) String str = new Tv(); 는 안됨
		// new name(); 객체 생성시 필요한 형태
			
		System.out.println(tv1.name); //값은 null
		System.out.println(tv1.power); //값은 false
		System.out.println(tv1.channel); //값은 0
		
		tv1.name = "삼성Tv"; //name 변수에 삼성Tv라는 String 값을 줌
		System.out.println(tv1.name); //값은 삼성Tv
		tv1.changePower(); //보이드형 앞에는 "=" 붙이면 안됨, = 을 만나면 왼쪽부터 인식됨
		
	}
}
