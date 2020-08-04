package com.leetcode.slidingWindow;

public class Minimum_Size_Subarray_Sum {

	public static void main(String[] args) {
		int array[] = new int[] {84,-37,32,40,95};
		int sum = 167;
		minSubArrayLen(sum, array);
	}

	private static void minSubArrayLen(int sum, int[] nums) {
		int startIndex = 0;
		int currentSum = 0, minLength = Integer.MAX_VALUE;
		for (int index = 0; index < nums.length; index++) {
			currentSum =  currentSum + nums[index];
			while(currentSum>=sum){
				minLength = Math.min(minLength, index-startIndex+1);
				/*if(startIndex+1 == nums.length){
					break;
				}*/
				currentSum = currentSum - nums[startIndex++];
			}
		}
		
		System.out.println(minLength==Integer.MAX_VALUE?0:minLength);
	}

}
