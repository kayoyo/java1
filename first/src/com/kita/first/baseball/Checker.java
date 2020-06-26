package com.kita.first.baseball;

public class Checker {
	
	
	public static boolean check(int i,Baseball j, MyBall k) {
		
		int str = 0; //스트라이크 저장
		int bal = 0; //볼 저장
		
		for(int a=0; a<i; a++) {
			for(int b=0; b<i; b++) {
				if(j.getClass(a) == k.getClass(b)) {
					if(a == b) {
						str++;
					}else {
						bal++;
					}
				}
			}
		}
		if (str == i) {
			System.out.printf("스트라이크 : %d 볼 : %d 아웃 : d\n%", str, bal, (i-str-bal));
			return false;
		} else {
			System.out.printf("스트라이크 : %d 볼 : %d 아웃 : d\n%", str, bal, (i-str-bal));
			return false;
		}
		
		
	
		
		
		
		
		
		
	}

}
