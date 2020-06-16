package com.kita.first.mission;

public class Mission7_1 {

	public static void main(String[] args) {

		// 1~100을 모두 더한 값이 출력 되도록

		int sum = 0;
		int number = 1;

		/*while (number <= 100) {
			sum += number++;
		}
		System.out.println("합계 : " + sum);
	
		   int sum =0; int number =0; 
		   while (number++ < 100) {  
		   sum += number; 
		   }
		   System.out.println("합계 : " + sum);
		 */
		while(true) {
		if(number > 100){
			break;	
			 }
		sum+= number++;
		}
		System.out.println("합계 : " + sum);
	}
}

