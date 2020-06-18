package com.kita.first.mission;

public class MethodMission2 {

	public static void main(String[] args) {

		// Printstar(6);
		// Printstar(3);

		// PrintstarSqure(4);

		// printStarTriangle(5);

		printStarTriangleReverse(5);
		

	}

	public static void PrintstarSqure(int bStar) {

		for (int z = 0; z < bStar; z++) {

			Printstar(bStar);

			/*
			 * for (int c = 0; c < bStar; c++) { System.out.print("*"); }
			 * System.out.println();
			 */

		}
	}

	public static void Printstar(int star) {

		for (int i = 0; i < star; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void printStarTriangle(int Fstar) {

		for (int z = 1; z <= Fstar; z++) {
			Printstar(z); // 1 2 3 4 5, for (int i = 0; i < star; i++) { System.out.print("*"); } 포함된 형태

		}
	}
	
	public static void printStarTriangleReverse(int star) {
		for(int k=star-1; k > 0; k--) { 
			printChar(' ', k);
			Printstar(star-k);
		}
	}

	public static void printChar(char ch, int cnt) {
		for(int c=0; c < cnt; c++) {
			System.out.print(ch);
	}
	}

		
	}


