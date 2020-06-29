package com.kita.first.practice;

public class Female extends People {
	

	public Female(String name) { //People에게 상속받음
		super(name,"여자");		
	}
	
	void selfIntroduce() {
		System.out.println("저는"+ name +"입니다." + gender + "입니다.");
	}
	
}
