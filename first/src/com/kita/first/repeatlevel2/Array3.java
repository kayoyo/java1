package com.kita.first.repeatlevel2;

public class Array3 {

	public static void main(String[] args) {
		
		int [][] arr = new int[2][3]; // 2행에 3열
		int [][] arr2 = {
				 {10, 20, 30}, //0번째
				 {40, 50, 80, 11}, //1번째
		};
		/*int [][][] arr3 = new int [3][4][5];
	   int [] arr4 = new int [60]; 배열과 같으나 구분이 되어 있지 않다.
		System.out.println(arr.length); // 값은 2
		System.out.println(arr2[0].length); // >> 값은 3
		System.out.println(arr2[1].length); // >> 값은 4*/
		
		for(int i=0; i <arr2.length; i++) {
			for(int z=0; i < z; z++) {	
				System.out.print(arr2[i][z]);
			}
			System.out.println();
		}
		
	}
}
