package com.kita.first.repeatlevel2;

public class NamedLoop {

	public static void main(String[] args) {

		Parent: for (int i = 0; i < 4; i++) { // 0 ~ 4
			for (int z = 0; z < 20; z++) { // 0 ~ 19
				if (z == 15) {
					break; // for(int z=0; z<20; z++) 종료 : 가장 가까운 for문이기 때문에
					// break Parent; for문 2개 종료(총 for문 밖에 변수를 지정해서 사용 할 때)
				}
				System.out.printf("%d-%d\n", i, z);
			}

		}
	}
}
