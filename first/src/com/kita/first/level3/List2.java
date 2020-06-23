package com.kita.first.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		
		Object obj = 1;
		obj = "aaa";
		obj = 1.1;
		// Object와 Object는 연산이 안 되므로 강제 형변환 하여 사용
		
		
		ArrayList <Integer> list = new ArrayList(); // ArrayList <Integer> list = new ArrayList(); 로 적게되면 get(i)의 int 삭제해도 됨
		list.add(1); //자바에 있는 모든 객체는 Object로 상속 받음 
		list.add(2);
		list.add(3);
		
		list.add(2,11); //1, 2, 11, 3, 10 >> 3 자리에 11 
		list.remove(list.size()-1); //마지막 자리 지움		
		list.remove(list.size()-1); //마지막 자리 한번 더 지움		
		
		for(int i=0; i<list.size(); i++) {
			int value = list.get(i); //list의 int 값을 받겠다는 의미
			System.out.print(value + ",");
		}
		 // 위와 같다.
		
		for (int val : list) {
			System.out.printf(val + ",");
		}
	}

}
