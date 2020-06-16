package com.kita.first.mission;

public class Mission6_1 {

	public static void main(String[] args) {

		int dan = 4;

		/*for (int i = 0; i < 9; i++) { // 10미만 9번 반복 
			System.out.printf("%d * %d = %d\n ", dan, (i+1), dan * (i+1)); */
			
			/*for (int i= 9; i < 18 ; i++) { // i=1로 만들기
				System.out.printf("%d * %d = %d\n ", dan, (i-8), dan * (i-8)); */
				
			for (int i= 14; i < 23 ; i++) { //14 ~ 22                     4*(14-13)
					System.out.printf("%d * %d = %d\n ", dan, (i-13), dan * (i-13)); 
                                                            // i=14 >> 14-13 실제 i값은 1로 반복됨
					                                        // 1~9 까지 총 9번 반복

			}
		}
	}
