package com.kita.first.level3;

//전역변수는 모든 메소드에서 사용 가능
public class Calc { //멤버필드
	
	public int n1; //전역변수
	public int n2;
	
	//객체화없이 메소드를 사용 >> Calc.sum (클래스에 메소드가 붙었기 때문)
	//30을 사용해야 함. 그래서 return형을 써야함.
	/*public static int sum(int m1, int m2) {
		return m1+m2;
	}*/ 
	//오버로딩 : 변수 이름은 같고 메개변수 개수 또는 타입으로 결정
	
	public int sum() {//메개변수가 없다. () 안에 int와 변수명 없이 바로 리턴값에 적어주기
		
		int result = 0; //지역변수(static을 적을 수 없다.)
		return n1+n2;
	}	
	}

	
	
	 

