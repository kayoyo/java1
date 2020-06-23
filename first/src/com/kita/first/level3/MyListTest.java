package com.kita.first.level3;

//class 앞에 public 적기 위해서는 파일명과  이름이 같아야 함, 한 파일에 class 여러개  생성가능하나  public을 붙일 수는 없다.
public class MyListTest {

	public static void main(String[] args) {
		MyList list = new MyList(); //new MyList를 객체화 하며, MyList list 객체의 주소값만 저장
		list.add(10); 
		list.add(15); 
		
		
		
	}
}

class MyList { //public을 넣으면 안됨
	//MyList가 가지고 있는 add 메소드
	// list.add(10); "="이 없으면 void일 확률이 높다.
	//전역변수에 10을 저장해야 함
	
	private int [] arr = new int[0]; // 배열을 선언 할 수 있는 객체화
	//private int[] arr;
	
	MyList() {
		//init()
	}
    
		void add(int num) { //10,15
		
		int [] temp = new int [arr.length+1]; //1 > 2 
		for(int i=0; i<arr.length; i++) { //0 < 0 첫번째 for문 반복x
			temp[i] = arr[i]; //변수 [index]   		
		}
		temp[arr.length] = num; 
		arr = temp; 
	
		  
		
	}
	
	

	
	
	
}