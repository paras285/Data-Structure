package com.leetcode.arrays.easy;
/**
 * Leetcode-53
 * @author Paras
 *	This problem is resolved using Kadane`s algrothim. This algorthim states that find the local maxima
 *	and then comparing that local maxima with global value. If that is greater than global value replace it
 */
public class MaximumSumForContigousSubArray {
	public static void main(String args[]){
		int array[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumSum(array));
	}

	private static int maximumSum(int[] array) {
		int length = array.length;
		int localMax = 0, maxGlobal  = Integer.MIN_VALUE;
		for(int index=0; index<length; index++){
			localMax = max(array[index],array[index]+localMax);
			if(localMax>maxGlobal){
				maxGlobal = localMax;
			}
		}
		return maxGlobal;
	}

	private static int max(int first, int second) {
		if(first>second){
			return first;
		}else{
			return second;
		}
	}
}
