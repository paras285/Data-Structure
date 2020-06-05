package com.leetcode.arrays.easy;
//Leetcode-9
public class isPalendrome {

	public static void main(String[] args) {
		int number = 1;
		System.out.println(isNumberPalendrome(number));
	}

	private static boolean isNumberPalendrome(int number) {
		if(number<0){
			return false;
		}
		int tempNumber = number;
		int reverseNumber = 0;
		while(number>0){
			reverseNumber = (reverseNumber*10)+(number%10);
			number = number/10;
		}
		if(tempNumber == reverseNumber){
			return true;
		}
		return false;
	}

}
