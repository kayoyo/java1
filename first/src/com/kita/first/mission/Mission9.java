package com.kita.first.mission;

public class Mission9 {

	// arr 1~100 값이 순서대로 들어가도록
	public static void main(String[] args) {

		int[] arr = new int[10];

		/*
		 * for (int i = 0; i < arr.length; i++) { arr[i] = (i + 1) * 2; } int sum = 0;
		 * for (int i = 0; i < arr.length; i++) { System.out.println(i + ":" + arr[i]);
		 * sum += arr[i]; } System.out.println("sum : " + sum);
		 */

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2; //여기서 i는 정수 타입

			if (arr[i] < 20) {
				System.out.print(arr[i] + ",");
			} else if (arr[i] == 20) {
				System.out.print(arr[i]);
				//System.out.println(new int[100].length); >> int값을 찍는 순간 메모리가 없어짐
			}
		}
	
	for(int i=0; i<arr.length; i++) {
		 arr[i] = (i+1) * 2; //짝수 만들 때 *2
	}
	for(int i=0; i<arr.length; i++) {
		System.out.print( i !=0 ? " , " : " "); //논리식 ? 참일때 : 거짓일때
		System.out.println(arr[i]); //마지막 출력
	}

	for(int i=0; i<5; i++) { //0000 1111 2222 3333 4444
		for(int r=4; r >=0;  r--){ //43210 43210 43210 43210 43210
		System.out.printf("%d,%d\n",i,r);
		}
	}
	}
}
