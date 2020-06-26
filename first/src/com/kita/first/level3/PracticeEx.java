package com.kita.first.level3;

public class PracticeEx { 

	public static void main(String[] arg) {

		Practice list = new Practice();

		list.add(10);
		list.add(20);
		list.add(30);

	}

}
class Practice  {
	
	private int[] arr = new int[0];
	
	void add(int num) { 
		
		int [] temp = new int [arr.length+1];
		for(int i=0; i <arr.length; i++) {
			temp [i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;
	}
	
}