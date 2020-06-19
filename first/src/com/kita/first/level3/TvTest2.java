package com.kita.first.level3;

public class TvTest2 {
	
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv tv2 = new Tv(); // tv2 = tv1 tv1의 주소값을 tv2에게 줌
		
		tv1.channelUp();
		tv1.channelUp();
		
		tv2.channelUp();
		
		tv1 = tv2;
		
		System.out.println("tv1 channel : " + tv1.channel);
		System.out.println("tv2 channel : " + tv2.channel);
		
		
		
	}

}
