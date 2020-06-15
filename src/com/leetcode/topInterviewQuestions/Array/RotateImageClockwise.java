package com.leetcode.topInterviewQuestions.Array;

public class RotateImageClockwise {
	public static void main(String args[]){
		int array[][] = new int[][]{
			{1,2,3},{4,5,6},{7,8,9}
		};
		printArray(array);
		rotateArray(array);
		printArray(array);
	}

	private static void printArray(int[][] array) {
		for(int outerIndex = 0; outerIndex<array.length; outerIndex++){
			for(int innerIndex = 0; innerIndex<array.length; innerIndex++){
				System.out.print(array[outerIndex][innerIndex]+ " ");
			}
			System.out.println("");
		}
		System.out.println("**************************************");
	}

	private static void rotateArray(int[][] array) {
		for(int outerIndex = 0; outerIndex<array.length; outerIndex++){
			for(int innerIndex = outerIndex; innerIndex<array.length; innerIndex++){
				int temp = array[innerIndex][outerIndex];
				array[innerIndex][outerIndex] = array[outerIndex][innerIndex];
				array[outerIndex][innerIndex] = temp;
			}
		}
		printArray(array);
		for(int outerIndex = 0; outerIndex<array.length; outerIndex++){
			for(int innerIndex = 0; innerIndex<array.length/2; innerIndex++){
				int temp = array[outerIndex][innerIndex];
				array[outerIndex][innerIndex] = array[outerIndex][array.length-1-innerIndex];
				array[outerIndex][array.length-1-innerIndex] = temp;
			}
		}
	}
}
