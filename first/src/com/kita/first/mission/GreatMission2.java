package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission2 {
	public static void main(String[] args) {

//1.사이다 500원, 2. 콜라600원, 3. 환타700원, 4.마운틴듀 800원, 5.초코우유400원, 6.바나우유 400원
// 메뉴를 선택 하세요: (종료: 0) 1 사이다
		
		Scanner sc = new Scanner(System.in);
		  
		
		String [] baverage = {"사이다 ","콜라","환타","마운틴듀","초코우유 ", "바나나우유"};
		int [] price = {500, 600, 700, 800, 400, 400};
		
		

	int menu = 0;System.out.print("메뉴를 선택하세요 : (종료:0)");menu=sc.nextInt();

}

}
