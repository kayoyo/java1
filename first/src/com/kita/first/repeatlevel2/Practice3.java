package com.kita.first.repeatlevel2;

public class Practice3 {

	public static void main(String[] args) {

		int len = 3;
		int[] arr = new int[len];

		// 1~9 사이의 랜덤한 값을 중복되지 않게 arr 배열 만큼 초기화
		// 중첩for문

		// for (int i=1; i<=9; i++) {
		// System.out.println(i);

		/*
		 * double randomValue = Math.random(); int intValue = (int) (randomValue * 10) +
		 * 1; System.out.println(intValue);
		 */

		for(int i=0; i < arr.length; i++) { //배열의 길이 만큼 3번 반복
			arr[i] = (int)(Math.random()*9+1); //1~9 랜덤 숫자
			for(int t=0; i>t; t++) { 
				if(arr[i]== arr[t]) { //중복 검사
					i--;
					break;
				}
			}
		}
						
			
			for (int value : arr) {
				System.out.println(value);
			}
	}

}
