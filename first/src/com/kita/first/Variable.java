package com.kita.first;

public class Variable {

	public static void main(String[] args) {
// 변수 : 값을 저장할 수 있는 공간
// 변수 선언  '=' : 오른쪽의 값을 복사하여 줌
       char v1; // 정수형
       v1 = 'A';
       System.out.println(v1);
       System.out.println('A');
       
       v1 = 'B';
       System.out.println(v1);
       System.out.println('B');
       
       byte v2; // 정수형 저장값: 1byte
       short v3; //정수형 저장값: 2byte
       int v4; //정수형    저장값: 4byte 속도가 가장 빠름
       long v5; //정수형  저장값: 8byte
// 강제형변환 :  v = (byte)129; >> -128
// 자동형변환 :  v3 = v2; short는  byte로 바꿀 수 있음
// 오버플로우(허용된 값보다 큰 값이 들어 갔을 때) or 언더플로우(허용된 값보다 작은 값이 들어 갔을 때)
// literal : 소스 코드의 고정된 값
       v2 = 10;
       v3 = 20;
       v4 = 30;
       v5 = 50;
       
       System.out.println();
       System.out.println(v2);
       System.out.println(v3);
       System.out.println(v4);
       System.out.println(v5);
       
       float v6; // 실수형   4byte double 보다 속도가 개선됨
       v6 = (float)10.1;
       v6 = 10.1f; //f는 소문자 대문자 상관없음
       
       double v7; // 실수형 8byte 지수법으로 계산되며 범위가 넓을 수록 정확하다. float 보다 정확하다고 함
       v7 = 10.1;
       v6 = (float)v7;
       
       boolean v8; // true of false
       System.out.println();
       v8 = true;
       System.out.println(v8);
       v8= false;
       System.out.println(v8);
      
       
// 객체는 명사적 성질, 메소드는 동사적 성질 
// 레퍼런스 변수는 대문자
// 레퍼런스에 선언된 변수는 .아래 메소드를 만들 수 있다.
       String r1 = "안녕하세요";
       System.out.println(r1);
       
       
			
	}
}
