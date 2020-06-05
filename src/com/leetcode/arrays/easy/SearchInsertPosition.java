package com.leetcode.arrays.easy;
//Leetcode-35
public class SearchInsertPosition {

	public static void main(String[] args) {
		int number = 3;
		int array[] = new int[]{1,3};
		System.out.println(findPosition(array,number));
	}

	private static int findPosition(int[] array, int number) {
		int length = array.length-1;
		if(number<array[0]){
			return 0;
		}else if(number>array[length]){
			return length+1;
		}else if(number == array[length]){
			return length;
		}
		for(int index = 0; index<length; index++){
			if(number == array[index]){
				return index;
			}else if(number>array[index] && number<array[index+1]){
				return index+1;
			}
		}
		return 0;
	}

}
