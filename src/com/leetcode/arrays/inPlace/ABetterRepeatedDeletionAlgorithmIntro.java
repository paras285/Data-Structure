package com.leetcode.arrays.inPlace;

public class ABetterRepeatedDeletionAlgorithmIntro {

	public static void main(String[] args) {
		int array[] = new int[]{0,0,1,1,1,2,2,3,3,4};
		int length = removeElements(array);
		for(int index = 0; index<length; index++){
			System.out.println(array[index]);
		}
	}

	private static int removeElements(int[] array) {
		int uniqueElementIndex = 0;
		for(int index = 1; index<array.length; index++){
			if(array[index]!= array[uniqueElementIndex]){
				array[++uniqueElementIndex] = array[index];
			}
		}
		return uniqueElementIndex+1;
	}

}
