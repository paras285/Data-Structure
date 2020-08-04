package com.leetcode.topInterviewQuestions;
/**
 * Not Working
 * @author Paras
 *
 */
public class MaximumProductSubArray {
	public static void main(String args[]){
		int array[] = new int[]{-2,3,-4};
		maxProduct(array);
	}

	private static void maxProduct(int[] array) {
		int maxProduct = array[0];
		int localMax = array[0];
		for(int index = 1; index<array.length; index++){
			localMax = Math.max(array[index], localMax * array[index]);
			if(localMax > maxProduct){
				maxProduct= localMax;
			}
		}
		System.out.println(maxProduct);
	}
}
