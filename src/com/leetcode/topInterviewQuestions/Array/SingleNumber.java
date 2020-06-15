package com.leetcode.topInterviewQuestions.Array;

public class SingleNumber {
	public static void main(String args[]){
		int array[] = new int[]{4,1,2,1,2};
		findSingleNumber(array);
	}

	private static void findSingleNumber(int[] array) {
		int value = array[0];
		for(int i=1; i<array.length; i++){
			value = value^array[i];
		}
		System.out.println(value);
	}
}
