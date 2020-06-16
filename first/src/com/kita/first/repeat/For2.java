package com.kita.first.repeat;

public class For2 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) { //3
			for (int z = 0; z < 5; z++) { //2
				for (int r = 0; r < 3; r++) { //1
					System.out.printf("d% - d% - d%\n", i, z, r);
				}

				
			}
		}

	}
}
