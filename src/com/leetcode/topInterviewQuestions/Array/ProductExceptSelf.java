package com.leetcode.topInterviewQuestions.Array;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int array[] = new int[]{1,2,3,4};
		productExceptSelf(array);
	}

	private static void productExceptSelf(int[] array) {
		int leftArray[] = array.clone();
		int rightArray[] = array.clone();
		leftArray[0]= 1;
		rightArray[array.length-1] = 1;
		for(int index = 1; index<array.length; index++){
			leftArray[index] = leftArray[index-1] * array[index-1];
		}
		for(int index = array.length-2; index>=0; index--){
			rightArray[index] = rightArray[index+1] * array[index+1];
		}
		System.out.println("Array is:"+Arrays.toString(array));
		System.out.println("Left Array is:"+Arrays.toString(leftArray));
		System.out.println("Right Array is:"+Arrays.toString(rightArray));
		int result[] = new int[array.length];
		for(int index = 0; index<array.length; index++){
			result[index] = leftArray[index] * rightArray[index];
		}
		System.out.println("Final Array is:"+Arrays.toString(result));
	}

}
