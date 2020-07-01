package com.kita.first.level8;

public class TryCatchTest {
//int 타입은 0으로 나누면 안됨 >> 에러 발생
	
	public static void main(String[] args) {
		meth();
		/*try {
			meth2();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("dsddd");*/
		int a = div(10, 2);
		System.out.println("a : " + a);
	}
	
	public static int div(int n1, int n2) {
		try {
			return n1 / n2;			
		} catch(Exception e) {
			return 0;
		}
	}

	public static void meth2() throws ClassNotFoundException { // throws : 호출하는 meth2() 메소드가 오류 해결하라는 의미
		
	Class.forName("dsddd");
		
	}
	
	public static void meth() {
		
		int result = 2;

		try {
			 Class.forName("");
			 
			/*if(result % 2 == 0) {
				return; */
			} catch(ClassNotFoundException e) {
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
		} finally { // 무조건 실행
			System.out.println("finally");
		}
		System.out.println("result : " + result);
		System.out.println("종료");
	}

}

