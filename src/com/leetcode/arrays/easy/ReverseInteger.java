package com.leetcode.arrays.easy;
//Leetcode-7
public class ReverseInteger {
	public static void main(String args[]){
		int number = -2147483648;
		System.out.println(number);
		System.out.println(reverseInteger(number));
	}

	private static int reverseInteger(int number) {
		boolean positiveNumber = (number>0)?true:false;
		long reverseNumber = 0;
		number = Math.abs(number);
		while(number!=0){
			reverseNumber = reverseNumber*10+number%10;
			number = number/10;
		}
		if(reverseNumber>Integer.MAX_VALUE || reverseNumber<Integer.MIN_VALUE){
			return 0;
		}
		return (positiveNumber)?(int)reverseNumber:-(int)reverseNumber;
	}
}
