package com.kita.first.repeatlevel2;

public class Break {

	public static void main(String[] args) {
		
		//가장 가까운  for문 종료 >> break
		for(int i=0; i<10; i++) { // i : 0123456789 
			for(int z=0; z<3; z++) { //z : 012  
				if(z == 3) {break;} // 3부분만 빠지고 출력
			}
			
		}
		for(int i=0; i<10; i++) { // i : 0123456789 
			for(int z=0; z<3; z++) { //z : 012  
				if(z == 3) {continue;}// for문을 종료 하지 않고 System.out.println(i) 실핼 시키지 않음
		System.out.println(i);
			}
		}
	}
}
		