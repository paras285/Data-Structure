package com.leetcode.arrays.deleting;
//Leetcode 26
public class RemoveDuplicates {

	public static void main(String[] args) {
		int array[] = new int[]{0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(array);
	}

	private static void removeDuplicates(int[] array) {
		int uniqueElementIndex=0;
		for(int index=1;index<array.length;index++){
			if(array[index] != array[uniqueElementIndex]){
				array[++uniqueElementIndex] = array[index];
			}
		}
		for(int index=0; index<uniqueElementIndex+1; index++){
			System.out.println(array[index]);
		}
	}

}
