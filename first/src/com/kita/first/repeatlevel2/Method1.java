package com.kita.first.repeatlevel2;

public class Method1 {
	

	public static void main(String[] args) {
		// 객체 안에 있으면 메소드, 밖에 있으면 함수라고 부름(자바는 함수 개념없이 메소드)
		// public static + [리턴타입 + 메소드명 +(파라미터)] { } 
		// [ ] 안에 있는 것은 메소드의 선언구,  { } 안에 있는 것은 메소드의 구현구 
		//  리턴타입 : 메소드의 결과물(void or not void : 회신이 있고 없고의 차이-호출하는 방법이 다름) 
		// 메소드 안에 메소드는 없다. 메소드 = 메소드, 메소드 위치는 상관없으며, 하나의 메소드 끝난 다음에 반드시 쓸 것 
	
		sum(15, 10);
		minus(20,5);
		// 같은 파일 안에 있으면 Method1.sum(10, 15);에서 Method1.sum 생략 가능
	    // 메소드에 static이 붙으면 메모리에 바로 올라감
		// 메소드를 나눠 쓰는 이유는 소스를 효율적으로 사용 가능(중복된 소스 배제 가능)
	
	}
	
	public static void sum(int n1, int n2) {
	// 외부로 부터 들어온 값을 더한다는 의미 (n1+n2)
	// 이름 옆에 ( ) 메소드와 관련이 있다. void sum에서 2개를 받고 싶으면 무조건 void main에서 2개가 정의 되어야 함
		System.out.println(n1+n2);	
		minus(20,5); // 배열 값 호출은 가능하나 메소드 정의는 안됨
		// return; 마지막에 생략되어 있음
		
	}
	public static void minus(int b1, int b2) {
		System.out.println(b1 - b2);
	}
	
}
