package com.leetcode.arrays.deleting;
//Leetcode 27
public class RemoveElement {

	public static void main(String[] args) {
		int array[] = new int[]{3,2,2,3};
		System.out.println(removeElements(array,2));
 	}

	private static int removeElements(int[] array,int val) {
		if(array.length == 0) return 0;
		int length = array.length;
		for(int index=0;index<length;index++){
			if(array[index] == val){
				removeElementFromAnArray(array,index);
				length--;
				index--;
			}
		}
		return length;
	}

	private static void removeElementFromAnArray(int[] array, int i) {
		for(int index=i+1; index<array.length;index++){
			array[index-1]=array[index];
		}
	}

}
