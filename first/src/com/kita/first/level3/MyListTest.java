package com.kita.first.level3;

//class 앞에 public 적기 위해서는 파일명과  이름이 같아야 함, 한 파일에 class 여러개  생성가능하나  public을 붙일 수는 없다.
public class MyListTest {

	public static void main(String[] args) {
		MyList list = new MyList(); // new MyList를 객체화 하며, MyList list 객체의 주소값만 저장
		list.add(10);
		list.add(15);
		list.add(20);

		//list.add(1, 100); 10, 15, 20 > 10, 100, 15, 20
		list.remove();
		
		
		

	}
}




class MyList {
	// public을 넣으면 안됨
	// MyList가 가지고 있는 add 메소드
	// list.add(10); "="이 없으면 void일 확률이 높다.

	private int[] arr = new int[0]; // 배열을 선언 할 수 있는 객체화
	                 // = [1]
	
	
	MyList() {
		
	}

	void add(int num) { 
		
		// 1개씩 칸을 늘리면서 값을 넣어줌                                                                       
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) { 
			temp[i] = arr[i]; // 변수 [index]
		  	
			}
		temp[arr.length] = num; 
		arr = temp; 

	}

	/*void add(int idx, int num) {
		
		int[] temp = new int[arr.length + 1]; 
		for (int i = 0; i < temp.length; i++) { 
			if (i < idx) { 
				temp[i] = arr[i];
			} else {
				temp[i + 1] = arr[i];
			}
		}
		temp[idx] = num;
	}*/

	int remove(int idx) { // 마지막값 지우고, 지우는 값 리턴 (20)

		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < temp.length; i++) {
			if (i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i + 1];
			}
		}
		int delVal = arr[idx];
		arr = temp;
		return delVal;
	}

	int remove() {
		return remove(arr.length - 1);
	}
	
	
}
