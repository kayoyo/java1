package com.kita.first.mission;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/*String gender = "";
		System.out.print("성별을 입력 하세요 : ");
		gender = sc.next();
		
		int height = 0;
		int male = 160;
		int female = 150;
		System.out.print("키를 입력하세요 : ");
		height = sc.nextInt();
		
		if("남".equals(gender)) 
		if(height > male) {
		System.out.println("당신의 키는 평균 초과 입니다.");
		} else if (height < male) {
		System.out.println("당신의 키는 평균 미만 입니다.");
		} else {
			System.out.println("당신의 키는 평균 입니다.");
		}
		
		if("여".equals(gender)) 
			if(height > female) {
			System.out.println("당신의 키는 평균 초과 입니다.");
			} else if (height < female) {
			System.out.println("당신의 키는 평균 미만 입니다.");
			} else {
				System.out.println("당신의 키는 평균 입니다.");
			}
			*/
		
		/*
		System.out.print("성별을 입력 하세요 : ");
		String gender = sc.next();
	
		if("남".equals(gender)) || ("여".equals(gender)) {
			System.out.print("키를 입력하세요 : ");
			int height = sc.nextInt();
			
			int standHeight = 0;
			if("남".equals(gender)) {
			    standHeight = 160;
			} else { 
				standHeight = 150;
		if(height > standHeight) {
			System.out.println("당신의 키는 평균 초과 입니다.");	
		} else if((height < standHeight)) {
			System.out.println("당신의 키는 평균 미만 입니다.");
		} else {
			System.out.println("당신의 키는 평균 입니다.");
		}
		}
		*/
		
		
			System.out.print("성별을 입력 하세요 : ");
			String gender = sc.next();
			System.out.print("키를 입력하세요 : ");
			int height = sc.nextInt();
			
		if("남".equals(gender)) {
			if(height > 160) {
			   System.out.println("당신의 키는 평균 초과 입니다.");
			} else if(height < 160) {
				  System.out.println("당신의 키는 평균 미만 입니다.");
			} else {
				  System.out.println("당신의 키는 평균 입니다.");
			}
	    if("여".equals(gender)) {
			if(height > 150) {
			   System.out.println("당신의 키는 평균 초과 입니다.");
			} else if(height < 160) {
				  System.out.println("당신의 키는 평균 미만 입니다.");
			} else {
				  System.out.println("당신의 키는 평균 입니다.");	
		    } 
		
		
}
}		
}
}
	


	
	   




