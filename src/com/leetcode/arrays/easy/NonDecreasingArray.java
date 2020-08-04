package com.leetcode.arrays.easy;

import java.util.Stack;

public class NonDecreasingArray {

	public static void main(String[] args) {
		int array[] = new int[]{3,4,2,3};
		checkPossibility(array);
	}

	private static boolean checkPossibility(int[] nums) {
		if(nums.length<=1){
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		int count = 0;
		stack.push(nums[0]);
		for(int i = 0; i<nums.length-1; i++){
			if(nums[i]>=nums[i+1]){
				count++;
			}
		}
		System.out.println(count);
		if(count<=1){
			return true;
		}
		return false;
	}

}
