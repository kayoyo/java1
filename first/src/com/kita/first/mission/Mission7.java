package com.kita.first.mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {

// 숫자를 입력 해 주세요(종료 0), 합계
		Scanner sc = new Scanner(System.in);

		int sum = 0; //while 밖에 있어야 합계를 계속 사용 할 수 있음, while 안에 있으면 0으로 계속 초기화
		while (true) { // 무한 반복됨
			/*
			 * System.out.print("숫자를 입력해 주세요: "); int number = sc.nextInt(); if(number !=0)
			 * 0이 아니면 sum +=number, 0이면 break { sum +=number; } else {
			 * System.out.println("합계 : " + sum); break; } }
			 */

			System.out.print("숫자를 입력해 주세요(종료 0) : ");
			int number = sc.nextInt();

			if (number == 0) {
				break;
			}
			sum += number; // 0일 때는 더해줄 필요가 없기 때문에 if 밑에 나둘 것
		}
		System.out.println("합계 : " + sum);
	}
}

