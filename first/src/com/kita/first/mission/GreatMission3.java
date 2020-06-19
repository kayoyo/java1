package com.kita.first.mission;

public class GreatMission3 {

	public static void main(String[] args) {
		
		int [][] arr = {
				{90, 100, 88}, //영어
				{34, 99, 45},  //수학
				{98, 65, 87},  //국어
				{98, 65, 87}  //사회
		};
		
		String[] clArr = {"엉어", "수학","국어","사회"}; //과목 출력 배열 
		int[] sumArr = new int[clArr.length]; //과목별 합계 점수 저장  
		
		for(int i=0; i < arr.length; i++) { 
			for(int z=0; z < arr.length; z++) {	 //90 100 88
			sumArr[i] += arr[i][z];
			}
		}
		int totalSum = 0; //전체 합계용
		int totalAverage = 0; //전체 평균용(과목별 아이템수 모두 더함) [0]3,[1]4,[2]3,[3]3 >> length 합 13
		for(int i=0; i < sumArr.length; i++) {
			System.out.printf("%s합계 : %d, 평균 : %.1\fn" , clArr[i], sumArr[i], (float)sumArr[i]/arr[i].length);
			totalSum += sumArr[i];
			totalAverage += arr[i].length;
		}
	
		System.out.printf("전체합계 : %d, 평균 : %.1\fn" , totalSum, (float)totalSum/totalAverage);
		
		//영어합계 : 평균:
		//수학합계 : 평균:
		//국어합계 : 평균:
		//전체합계 : 평균:
		
		
		
		
		
	}
		}

	

