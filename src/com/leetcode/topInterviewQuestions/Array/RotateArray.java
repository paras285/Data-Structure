package com.leetcode.topInterviewQuestions.Array;

public class RotateArray {

	public static void main(String[] args) {
		int array[] = new int[]{1};
		int k = 1;
		//Expected Output --> 5,6,7,1,2,3,4
		rotateArray(array,k);
		printArray(array);
	}

	private static void printArray(int[] array) {
		for(int index= 0; index<array.length; index++){
			System.out.println(array[index]);
		}
	}

	private static void rotateArray(int[] array, int k) {
		int length = array.length;
		k %= length;
		reverseArray(array,0,length-1);
		reverseArray(array,0,k-1);
		reverseArray(array,k,length-1);
	}

	private static void reverseArray(int[] array, int left, int right) {
		while(left<right){
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

}
