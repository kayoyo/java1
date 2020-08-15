package com.kita.first.repeatlevel2;

public class Array {

	public static void main(String[] args) {
		// 배열은 레퍼런스 변수, new 객체화 시킴, 배열 선언 []
		int[] arr = new int[4]; // 4개의 배열 선언 index는 0 1 2 3
		arr[0] = 10; // 배열의 값이 10,
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		// 변수 선언을 덜 하기 위해 배열 선언, for문 사용
		char[] arr2 = new char[20];
		float[] arr3 = new float[10];
		String[] arr4 = new String[200]; // //값을 지정하지 않으면 200개의 크기에 값은 null=0
		arr4[200] = "dd";
		
		int[] arr5 = { 10, 20, 30, 40 }; // 4개의 배열이 만들어 지고 10, 20, 30, 40의 숫자가 각각 들어 있다.
		int[] arr6 = arr5;

		System.out.println(arr2);
		System.out.println(arr3);

		int [] arr7 = new int[100];
		//new int[] 값을 변경하면 arr7.length의 값도 변경됨
		int i;
		for(i=0; i<arr7.length; i++) { //100번 돌면서 각방에 i값 5를 찍음
			arr7[i] = 5;
		}
		for(int i=0; i<arr7.length; i++) { //100번을 돌면서 [i]값을 찍음
			System.out.println(arr7[i]); 
		} 
		/*for(int i=0; i<100; i++) {
			arr7[i] = 5;
			System.out.println(arr7[i]); //100번을 돌면서 [i]값을 찍음
		}*/  
		
		
		int arr[] = new int[100];
		//반대로 초기화(0으로 초기화)
		for(int i=arr.length-1; i>=0; i--)
		{
			arr[i] = 0 ;
	        }
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = i;
		}
		
		
	}


