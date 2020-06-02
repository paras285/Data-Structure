package com.leetcode.arrays.searching;

public class ValidMountainArray {

	public static void main(String[] args) {
		int array[] =  new int[]{1,2,3,4,5,6};
		System.out.println(isValidMountain(array));
	}

	private static boolean isValidMountain(int[] array) {
		int length =  array.length;
		if(length<3){
			return false;
		}
		int index = 0;
		if((array[index]>array[index+1]) || (array[length-1]>array[length-2])){
			return false;
		}
		while(index< length-1){
			if(array[index] == array[index+1]){
				return false;
			}else if(array[index] < array[index+1]){
				index++;
			}else{
				index++;
				break;
			}
		}
		while(index<length-1){
			if(array[index] == array[index+1]){
				return false;
			}else if(array[index] > array[index+1]){
				index++;
			}else{
				return false;
			}
		}
		return true;
	}

}
