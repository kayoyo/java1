package com.kita.first.baseball;

public class Game {
	public static void main(String[] args) {
		int gameCnt = 3;
		
		Baseball ball= new Baseball(gameCnt);
		int val = ball.getClass(0);
		
		MyBall myBall = new MyBall(gameCnt);
		
		do {
			myBall.setNumbers();
		} while(Checker.check(gameCnt, ball, myBall));
		
		
		//System.out.println("게임종료!");
		}
		
	}

