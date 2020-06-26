package com.kita.first.level4;

public class Bird extends Animal{ //Animal을 사용할 수 있게 된다 : Animal을 복사해서  Bird에 복사해줌
	
	/*public Bird() { Bird bird = new Bird(); 기본 생성자	
		super();
	}*/
	
	//Animal의 protected Animal(String name)의 형식을 불러옴 
	protected Bird(String name) { 
	     super(name,"조류"); 
	}
	
	
	void flying() {
		System.out.println("훨훨");		
	}
	
	@Override //← 오버라이딩 사용 시 붙여주기
	void crying() {
		super.crying(); //animal의 crying을 불러옴 
		System.out.println("짹짹");		
	}

}
