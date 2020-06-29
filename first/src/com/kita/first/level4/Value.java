package com.kita.first.level4;

public class Value extends Object{

	private int val;
	
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	
	}
	
	@Override
	public boolean equals(Object obj) { //obj에 getVal을 받아옴
		Value j = (Value)obj; //obj를 value 모양으로 형변환 >> value안에 있는 메소드, 멤버필드를 사용할 수 있게 함
		return j.getVal() == val;
	}

	
	
	
	
	}
	

