package com.kita.first;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.printf("나이?");
		int age = scan.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.printf("이름?");
		String name = scan.next();
		System.out.println("이름 : " + name);
		scan.close();
		
		
	}
}
