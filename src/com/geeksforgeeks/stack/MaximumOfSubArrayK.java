package com.geeksforgeeks.stack;
/*
 * Following is Not Working
 * Refer to MaximumOfSubArrayK_Practice for complete solution
 */
public class MaximumOfSubArrayK {
	public static void main(String args[]){
		int array[] =  new int[]{9,9,1,3,2,6,9};
		maxSum(array,3);
	}

	private static void maxSum(int[] array,int k) {
		int sum = 0,maxSum = 0;
		for(int index = 0; index<array.length; index++){
			sum+= array[index];
			if(index>= (k-1) &&index%(k-1) == 0){
				maxSum = Math.max(maxSum, sum);
				sum = sum - array[index-(k-1)];
//				k = k-1;
			}
		}
		System.out.println(maxSum);
	}
}
