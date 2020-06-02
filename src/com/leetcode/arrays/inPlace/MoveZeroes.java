package com.leetcode.arrays.inPlace;

public class MoveZeroes {
	public static void main(String args[]){
		int array[] = new int[]{0,1};
		moveZeroes(array);
		printArray(array);
	}

	private static void printArray(int[] array) {
		for(int index = 0; index<array.length; index++){
			System.out.println(array[index]);
		}
	}

	private static void moveZeroes(int[] array) {
		int nonZeroIndex = -1;
		for(int index = 0; index<array.length; index++){
			if(array[index] != 0){
				array[++nonZeroIndex] = array[index];
			}
		}
		for(int index = nonZeroIndex+1; index<array.length; index++){
			array[index] = 0;
		}
		
	}
}
