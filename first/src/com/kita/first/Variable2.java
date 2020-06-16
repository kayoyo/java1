package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		
		int num = 10;
		int num2, num3 = 20;
		int num4 = 10, num5 = 20;

// 이름 주의 사항
// 1. 소문자로 시작 예)int myMaxHeight
// 2. 특수기호는 '_', '$'만 사용가능 '-'특수기호 시작해도 무방
// 3. 숫자로 시작 안됨, 뒤에 붙이는 건 가능 예) int 12a(X), int top10; int top10Good(O)
// 4. 예약어(보라색) 사용 금지 예)int char
// 5. 변수명 띄우면 안됨
// 6. 대소문자를 가린다. 예) int aa, aA, Aa, AA;
		
		
		final int MY_MAX_HIGHT = 1_000_000;
		System.out.println(MY_MAX_HIGHT);
// 7. 상수명은 무조건 대문자, 구분은 '_' 
// final로 선언된 상수는 지정되는 순간 값을 변경하지 못한다.

        
	
	
	}

}
