package com.leetcode.topInterviewQuestions;
/*
 * Not Working, need to add condition where it can have more than 1 duplicates
 */
public class FindDuplicateNumber {

	public static void main(String[] args) {
		System.out.println(2^2);
//		int nums[] =  new int[]{1,2,3,4,2,2};
//		findDuplicateNumber(nums);
	}

	private static void findDuplicateNumber(int[] nums) {
		int length = nums.length;
		int totalSum = ((length-1)*(length))/2;
		for(int num:nums){
			totalSum = totalSum - num;
		}
		System.out.println(Math.abs(totalSum));
	}

}
