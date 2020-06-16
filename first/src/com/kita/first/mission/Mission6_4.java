package com.kita.first.mission;

public class Mission6_4 {

	public static void main(String[] args) {

		for (int r = 1; r < 10; r++) { //index 열의 값 변화
			for (int i = 2; i < 10; i++) { //index 행의 값 변화
				System.out.printf("%d * %d = %d\t", i, r, (i * r));
			}
			System.out.println();
		} 
		//기존 for(int i) for(int r) → for(int r) for(int i) 후 printf 에서 for문에 적은 순서와 반대로 적고 \t[tap]추가

	}
}
