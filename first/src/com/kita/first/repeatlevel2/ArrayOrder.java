package com.kita.first.repeatlevel2;

import java.util.Arrays;

public class ArrayOrder {

	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };

		/*
		 * System.out.println(arr.length);
		 * 
		 * int temp = arr[0]; arr[0] = arr[1]; // arr[0]29가 arr[1]33으로 바뀜 arr[1] =
		 * temp;// arr[0]의 저장값인 29가 됨 System.out.println("arr[0] : " + arr[0]);
		 * System.out.println("arr[1] : " + arr[1]);
		 * 
		 * for (int val : arr) { System.out.print(val + ","); }
		 */

		for (int i = 0; i < arr.length - 1; i++) { // 01234567 i값과 r값을 비교
			for (int jj = i + 1; jj < arr.length; jj++) { // 12345678
			}
			if (arr[i] > arr[jj]) {
				int s = arr[i];
				arr[i] = arr[jj];
				arr[jj] = s;
			}
		}
		for (int s = 0; s < arr.length; s++) {
			{
				System.out.print(arr[s] + " ");
			}
		}
	}
}
