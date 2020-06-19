package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission1 {

	public static void main(String[] args) {

		// 랜덤한 중복되지 않은 숫자 3개
		// (1~9) 숫자
		// 스트라이크: 자리o 숫자o
		// 볼 : 자리x 숫자o
		// 나머지 아웃

		Scanner sc = new Scanner(System.in);

		final int LEN = 3;
		
		System.out.printf("숫자 %d 야구 게임 시작\n", LEN);
		
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];

		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * 9 + 1);
			
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
				
		int cnt = 0;
		while(true) {
			cnt++;
			int s=0, b=0;
			
			System.out.print("숫자 입력: ");
			for(int i=0; i<myArr.length; i++) {
				myArr[i] = sc.nextInt();
			}
			
			for(int i=0; i<LEN; i++) {
				for(int z=0; z<LEN; z++) {
					if(rArr[i] == myArr[z]) {
						if(i == z) { 
							s++;
						} else {
							b++;
						}
					}
				}
			}
			
			if(s == LEN) {
				break;
			}
			
			System.out.printf("S:%d / B:%d / O:%d\n", s, b, (LEN-s-b));
		}
		sc.close();
		
		System.out.printf("%d 시도 - End!", cnt);
			
        }	
			
		
	}
