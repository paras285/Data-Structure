package com.leetcode.arrays.conclusion;
//Leetcode-1051
import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int array[] = new int[]{1,1,4,2,3,1};
		check(array);
	}

	private static void check(int[] array) {
		int length = array.length;
		int tempArray[] = array.clone();
		int swap = 0;
		Arrays.sort(tempArray);
		for(int index = 0; index<length; index++){
			if(tempArray[index]!=array[index]){
				swap++;
			}
		}
		System.out.println(swap);
	}

}
