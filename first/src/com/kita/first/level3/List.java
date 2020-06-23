package com.kita.first.level3;

import java.util.Arrays;

public class List {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		int[] temp = new int[arr.length+1]; //리터럴을 4 사용할 수 있음, 주소값 추가
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i]; //3		
		}
		temp[arr.length] = 4;		
		arr = temp; //4
		
		
		System.out.println(Arrays.toString(arr)); //배열 내용 출력
	}

}
