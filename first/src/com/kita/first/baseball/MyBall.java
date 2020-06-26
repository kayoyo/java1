package com.kita.first.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall {

	private int[] myArr;
	private Scanner scan;

	public MyBall() { //MyBall myBall = new MyBall(); 일 때의 경우
	}
	public MyBall(int i) {
		init(i);
	}

	public void setNumbers() {
		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("%d번째 숫자를 입력 해 주세요(1~9) : ", i + 1);
			myArr[i] = scan.nextInt();
			if (myArr[i] < 0 || myArr[i] > 9) {
				System.out.println("입력 범위를 벗어나셨습니다. 다시");
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (myArr[i] == myArr[j]) {
					System.out.println("중복된 값을 입력하셨습니다. 다시");
					i--;
					break;
				}
			}
		}
	}
	
	public int getlength() {
		return myArr.length;
	}
	
	public int getClass(int i) {
		return myArr[i];
	}

	private void init(int i) {
		myArr = new int[i];
		scan = new Scanner(System.in);
	}
	
	public void checkMine (){
		System.out.println(Arrays.toString(myArr));
	}
	
	}


