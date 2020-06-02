package com.leetcode.arrays.introduction;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int array[] = new int[]{1,1,0,1,1,1};
		int maxConsecutiveOnes = findMaxConsecutiveOnes(array);
		System.out.println(maxConsecutiveOnes);
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = -1;
        int count = 0;
        for(int index= 0 ; index<nums.length; index++){
            if(nums[index] == 1){
                count++;
            }else{
                count = 0;
            }
            if(count>maxLength){
            	maxLength = count;
            }
        }
		return maxLength;
	}

}
