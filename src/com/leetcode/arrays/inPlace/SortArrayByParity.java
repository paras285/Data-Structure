package com.leetcode.arrays.inPlace;
//Leetcode-905
public class SortArrayByParity {
	public static void main(String args[]){
		int array[] = new int[]{4,3};
		swapArray(array);
		printArray(array);
	}

	private static void printArray(int[] array) {
		for(int index= 0; index<array.length; index++){
			System.out.println(array[index]);
		}
	}

	private static void swapArray(int[] array) {
		int left = 0, right = array.length-1;
		while(left<right){
			if(array[left]%2 != 0){
				if(array[right]%2 == 0){
					array[left] = array[left]+array[right];
					array[right] = array[left]-array[right];
					array[left] = array[left]-array[right];
					left++;
					right--;
				}else{
					right--;
				}
			}else{
				left++;
			}
		}
	}
}
