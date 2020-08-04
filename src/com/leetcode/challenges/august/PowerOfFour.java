package com.leetcode.challenges.august;

public class PowerOfFour {
	public static void main(String[] args) {
		int number = 4;
		System.out.println(999996%4);
		System.out.println(isPowerOfFour(number));
	}

	private static boolean isPowerOfFour(int number) {
		int temp = number & (number-1);
		if(temp == 0 && number>1){
			int count = 0;
			while(number>1){
				number = number>>1;
				count++;
			}
			return (count%2==0)?true:false;
		}
		return false;
	}
}
