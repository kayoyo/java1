package com.kita.first.repeatlevel2;

import java.util.Arrays;

public class ArrCopy2 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 10 };
		int[] arr2 = copyArr(arr);

		System.out.println(arr == arr2); // 주소값 복사
		System.out.print("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
	}

	//
	public static int[] copyArr(int[] arr) { // copyArr에 return 해줄 것은 int[]모양이다.
		int[] arr2 = new int[arr.length]; // int [] arr2 배열을 만드는데 길이는 arr.length길이와 같이 만들겠다.
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i]; //arr[i]의 값을 arr2[i]에 보낸다.
		}
		return arr2; // int [] arr2
	}
}
