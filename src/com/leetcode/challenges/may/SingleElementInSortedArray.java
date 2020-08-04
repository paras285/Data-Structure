package com.leetcode.challenges.may;
/*
 * Leetcode-540
 */
public class SingleElementInSortedArray {

	public static void main(String[] args) {
		int array[] = new int[]{3,3,7,7,10,10,11};
		int value = singleNonDuplicate(array);
		System.out.println(value);
	}

	private static int singleNonDuplicate(int[] array) {
		for(int index = 1; index<array.length-1; index= index+2){
			if(array[index] != array[index-1]){
				return array[index-1];
			}
		}
		return array[array.length-1];
	}

}
