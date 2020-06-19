package com.kita.first.level3;

//사용자의 정의 클래스
//객체는 속성과 메소드로 구성

public class Tv {
	
	String name; 
	boolean power;
	int channel;
	
	void changePower() {
		power = !power; //false
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
		
	}