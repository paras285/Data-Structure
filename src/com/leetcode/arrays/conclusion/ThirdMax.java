package com.leetcode.arrays.conclusion;

import java.util.Arrays;

public class ThirdMax {

	public static void main(String[] args) {
		int array[]= new int[]{1,2,-2147483648};
		System.out.println(findThirdMaxOrMax(array));
	}

	private static int findThirdMaxOrMax(int[] array) {
		int length =  array.length;
		if(length<3){
			return (array[0]>array[1])?array[0]:array[1];
		}
			
		Arrays.sort(array);
		int firstMax =  array[length-1];
		boolean found = false;
		int secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
		for(int index = length-2; index>=0; index--){
			if(array[index] < firstMax){
				if(array[index]<secondMax && secondMax!=Integer.MIN_VALUE){
					thirdMax = array[index];
					found = true;
					break;
				}
				secondMax = array[index];
			}
		}
		return (found)?thirdMax:firstMax;
	}

}
