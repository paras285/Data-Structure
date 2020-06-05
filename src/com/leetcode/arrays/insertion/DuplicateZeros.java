package com.leetcode.arrays.insertion;
//Leetcode-1089
public class DuplicateZeros {
	public static void main(String args[]){
		int array[] = new int[]{0,0,0,0,0,0,0};
		duplicateArray(array);
	}

	private static void duplicateArray(int[] array) {
		for(int index = 0; index<array.length-1; index++){
			if(array[index] == 0){
				shiftElementsToRight(array,index+1,array.length-2);
				array[++index]=0;
			}
		}
		for(int index=0; index<array.length; index++){
			System.out.println(array[index]);
		}
	}

	private static void shiftElementsToRight(int[] array, int start, int end) {
		for(int index = end+1; index>start; index--){
			array[index] = array[index-1];
		}
	}

}
