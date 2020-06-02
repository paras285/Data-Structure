package com.leetcode.arrays.conclusion;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Paras
 * For algorithm refer com.leetcode.arrays.conclusion.removeDuplicates_better.java
 *
 */
public class FindAllNumbersThatDisappearedFromArray {
	public static void main(String args[]){
		int array[] = new int[]{4,3,2,7,8,2,3,1};
		findList(array);
	}

	private static void findList(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for(int index=0; index<array.length; index++){
				int tempIndex = Math.abs(array[index])-1;
				if(array[tempIndex]>0){
					array[tempIndex] = -array[tempIndex];
				}
		}
		for(int index = 0; index<array.length; index++){
			if(array[index]>0){
				list.add(index+1);
				
			}
			
		}
		System.out.println(list);
	}
}
