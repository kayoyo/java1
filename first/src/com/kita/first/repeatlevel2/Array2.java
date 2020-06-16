package com.kita.first.repeatlevel2;

public class Array2 {

	public static void main(String[] args) {

		//선택정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };

		int least;
		for (int i = 0; i < arr.length - 1; i++) {
			least = i;
			for (int z = i + 1; z < arr.length; z++) {
				if (arr[least] > arr[z]) {
					least = z;
				}
			}
			if (least !=i) {
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
		// 버블정렬
		for(int i=arr.length - 1; i>0; i--) {
			for(int z=0; z<i; z++) {
				if(arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
				}
			}
		}
	/*foreach문은 sequence가 있는 객체는 모두 사용가능. 객체가 가지고 있는 값을 순차적으로 하나씩 넘겨준다(자신이 가지고 있는 길이만큼).*/
		for(int val : arr) {
			System.out.println(val);
		}
	//아래와 같다.
			for(int i=0; i<arr.length; i++) {
				int val = arr[i];
				System.out.println(val);
			}
	
	
	
	}
	
}
