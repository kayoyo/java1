package com.kita.first;

public class Switch {

	public static void main(String[] args) {
		
		int num = 3;
		
		switch(num) {
		
		case 1 : System.out.println("1 입니다."); // break이 없으면 case value를 유형별로 보여주지 않음 
			break;
			
		case 2 : System.out.println("2 입니다.");
			break;
			
		case 3 : System.out.println("3 입니다.");
			break;
		
		default : System.out.println("1 ~ 3이 아닙니다.");
			break; // default break 생략가능
			
		}
	}
}
