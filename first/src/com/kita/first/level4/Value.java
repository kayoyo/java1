package com.kita.first.level4;

public class Value extends Object {
	//final을 붙이면 상속 불가, 오버라이딩 불가
	
	private int val;
	
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() { //private기 때문에 이 메소드로 사용
		return val;
	
	}
	
	@Override
	public boolean equals(Object obj) { //obj에 getVal을 받아옴
		Value j = (Value)obj; //obj를 value 모양으로 형변환 >> value안에 있는 메소드, 멤버필드를 사용할 수 있게 함
		return j.getVal() == val;
	}

	@Override
	public String toString() {
		return String.format("%d", val); 
		//format은 printf와 비슷하나 콘솔에 출력 직전까지의 실행, 값을 return하는게 목적)
		//return val + ""; << 강제로 String 출력
		
	}
	
	
	
	}
	

