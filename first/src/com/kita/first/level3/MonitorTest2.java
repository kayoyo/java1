package com.kita.first.level3;

public class MonitorTest2 {
	public static void main(String[] args) {
		//객체마다 다른 값이 저장되기 바랄때는 static을 붙이면 안된다.
		Monitor.brand = "삼성";
		Monitor.printBrand();
		
		
		Monitor m1 = new Monitor();
		m1.printInfo();
		
		int result = Integer.parseInt("11");
	}

}
