package com.kita.first.level3;

//메인 메소드를 실행 시키기 위함
public class CalcTest {
	public static void main(String[] args) {
		
		//Calc.sum(); void일 확률이 높다.
		Calc calc1 = new Calc(); //객체화 됨
		calc1.n1 = 20;
		calc1.n2 = 30;
		
		
		//System.out.println(Calc.sum(10,20)); 
		  System.out.println(calc1.sum()); 
		//System.out.println(Calc2.minus(30, 10)); // 20
	}
 
}
