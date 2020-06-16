package com.kita.first.mission;

import java.util.Random;

public class Practice2 {

	public static void main(String[] args) {

		 //for (int i = 0; i < 10; i++) {
			double r = Math.random();
			int r2 = (int)(r*16);
			//0~15사이의 값 : Math.random 값 * 16 >>15에 1 더해서 곱하기
			int r3 = (int)(Math.random() * 16);
			int r4 = (int)((Math.random() * 15) +1); //0~14 사이의 값에 1 더하기
			int r5 = (int)((Math.random() * 21) +30); //30~50 사이의 값0,  21= 범위, 30이 옆으로 이동하는 범위 
			int r6 = (int)((Math.random() * 11) + 60);//60~70사이의 값                            
			System.out.println(r6);

	
		}
	}


