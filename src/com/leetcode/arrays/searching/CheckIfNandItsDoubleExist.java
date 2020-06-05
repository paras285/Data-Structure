package com.leetcode.arrays.searching;

import java.util.HashSet;
//Leetcode-346
public class CheckIfNandItsDoubleExist {

	public static void main(String[] args) {
		int array[] = new int[]{7,1,14,11};
		System.out.println(checkIfExist(array));
	}

		private static boolean checkIfExist(int[] array) {
			HashSet<Integer> set = new HashSet<>();
			for(int index=0;index<array.length;index++){
				if(set.contains(array[index]*2) ||
						(set.contains(array[index]/2) && array[index]%2 == 0)){
					return true;
				}else{
					set.add(array[index]);
				}
			}
			return false;
		}

}
