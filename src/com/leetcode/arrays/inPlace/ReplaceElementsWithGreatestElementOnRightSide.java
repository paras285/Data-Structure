package com.leetcode.arrays.inPlace;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		int array[] = new int[]{17,18,5,4,6,1};
		replaceElementinArray(array);
		printArray(array);
	}

	private static void printArray(int[] array) {
		for(int index = 0; index<array.length; index++){
			System.out.println(array[index]);
		}
	}

	private static int[] replaceElementinArray(int[] array) {
		int length = array.length;
		int largestValueOnRight = array[length-1];
		array[length-1] = -1;
		for(int index = length-2 ; index>=0; index--){
			if(array[index] > largestValueOnRight){
				int temp  = array[index];
				array[index] = largestValueOnRight;
				largestValueOnRight = temp;
			}else{
				array[index] = largestValueOnRight;
			}
		}
		return array;
	}

}
