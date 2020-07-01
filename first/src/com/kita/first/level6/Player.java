package com.kita.first.level6;

public abstract class Player {
	
	//play 메소드 선언만 함
	//추상 메소드를 하나라도 가지고 있으면 클래스 앞에 abstract 붙여줘야 함
	//부모 역할만 함
	//abstract 메소드가 없어도 클래스 앞에 abstract 붙일 수 있다
	public abstract void play();
	
	public void stop() {
		System.out.println("재생을 멈쳤다.");
	}

}

class CDplayer extends Player {

	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
		
	}
	
}

class DVDplayer extends Player {

	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
		
	}
	
}
