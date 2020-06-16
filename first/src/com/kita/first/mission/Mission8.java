package com.kita.first.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {

		// 랜덤값 10-90을 맞추는 게임

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rvalue = rand.nextInt(81) + 10;
		// int r = (int)((Math.random() * 81)+10);
		System.out.println("정답 확인 : " + rvalue);

		while (true) {
			System.out.println("값 입력 : ");
		int number = sc.nextInt();
		
		if(rvalue > number) {
			System.out.println("up"); 			
		} else if (rvalue < number) { //
			System.out.println("down");
		} else {
			break;
				}		
		}
	{ System.out.println("Great");

	}
}
}
