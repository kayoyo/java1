package com.kita.first.repeatlevel2;

import java.util.Arrays;

public class ArrCopy {

	public static void main(String[] args) {
		int [] arr= {2, 4, 6, 7, 10};
		int [] arr2 = new int[arr.length]; //int형 배열을 만드는데 arr.length 길이 만큼 만들겠다.
		//int [] arr2=null; arr = arr2 가르키게 됨
		
		//arr2 = arr; 주소값 복사
		
		for(int i = 0; i<arr.length; i++) {
				arr2[i] = arr[i]; //값만 넣어줌, 주소값은 다름
			
				//arr[i]의 값을 arr2[i]에 보낸다.
			
		}
		System.out.println(arr == arr2); //주소값만 비교
		System.out.print("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));	
		
	}
	
}
