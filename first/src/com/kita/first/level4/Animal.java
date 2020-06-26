package com.kita.first.level4;

public class Animal { //extends Object 생략되어 있음
	private String name;
	private String type;
	
    /* public Animal() { Animal animal = new Animal(); 기본 생성자	
	}*/
    
	protected Animal(String name, String type) { //추가 생성자
		this.name = name;
		this.type = type;
	}
	
	void crying() {
		System.out.println("울다");
	}
	
	void eat() {
		System.out.println("먹다");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s입니다. \n", name);
	}

}
