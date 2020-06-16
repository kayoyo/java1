package com.kita.first.mission;

public class Mission6_7 {

	public static void main(String[] args) {

		int star = 5;
		/*
		 * for (int i = 1; i <= star; i++) { for (int r = 0; r < (star - i); r++) {
		 * System.out.print("__"); } for (int k = 0; k < i; k++) {
		 * System.out.println("*"); } } System.out.println();
		 */
		for (int i = 1; i <= star; i++) {
			for (int z = star; z > 0; z--) {
				System.out.print(i < z ? " " : "*");
			}
			System.out.println();
		}
	}
}
