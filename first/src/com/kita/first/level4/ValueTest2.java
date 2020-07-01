package com.kita.first.level4;

public class ValueTest2 {
	
	public static void main(String[] args) {
		
		String str = new String("안녕");
		System.out.println("str :" + str);
		
		System.out.println();
		
		Value val = new Value(2);
		System.out.println("val : " + val); //String("val : ") + object(val)를 만나면 String이 우선
		
		
		String strVal = String.valueOf(val); 
		String strVa2 = val.toString(); //val은 object로 부터 상속을 받아서 toString이 가능함
	
	
			
	}
	
	
	}	
