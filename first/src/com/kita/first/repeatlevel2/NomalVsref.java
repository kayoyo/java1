package com.kita.first.repeatlevel2;

public class NomalVsref {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println("brfore num : " + num);
		changeVal(num);
		System.out.println("after num : " + num);
		
		int[] numArr = {10};	
		System.out.println("brfore num : " + numArr[0]);
		changeVal(numArr);
		System.out.println("after num : " + numArr[0]);
	}
	
	public static void changeVal(int num) {
		num =30;
		//변수값만 30을 줄 뿐 영향을 못 미침
		
	}
	
	public static void changeVal(int[] numArr) {
	
		numArr[0] = 30;
		//int[] numArr = {10}; 객체의 주소값이 들어가서 numArr[0]찍으면 10 
		// changeVal(numArr) 객체의 주소값이 들어가서 numArr[0]찍으면 30으로 바뀜
		
	}
	
}

