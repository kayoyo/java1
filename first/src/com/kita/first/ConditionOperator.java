package com.kita.first;

public class ConditionOperator {

	public static void main(String[] args) {
		int num = 3;

		boolean isOdd = (num % 2 == 1 ? true : false);
		System.out.printf("%d isOdd ? %b\n, num, isOdd");

		/*
		 * String result = (num % 2 == 1 ? "홀수" : "짝수");
		 * System.out.printf("%d 는 ? %b\n", num, result);
		 */

	}
}