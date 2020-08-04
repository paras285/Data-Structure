package com.leetcode.arrays.easy;
/*
 * leetcode-349
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int array1[] = new int[]{4,9,5};
		int array2[] = new int[]{9,4,9,8,4};
		int array[] = intersection(array1,array2);
		System.out.println(Arrays.toString(array));
	}

	private static int[] intersection(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		Set<Integer> set = new HashSet<>();
		int firstStartIndex = 0,secondStartIndex =0,
				firstLastIndex = array1.length,secondLastIndex = array2.length;
		while(firstStartIndex<firstLastIndex && secondStartIndex<secondLastIndex){
			if(array1[firstStartIndex] == array2[secondStartIndex]){
				set.add(array1[firstStartIndex]);
				firstStartIndex++;
				secondStartIndex++;
			}else if(array1[firstStartIndex] > array2[secondStartIndex]){
				secondStartIndex++;
			}else{
				firstStartIndex++;
			}
		}
		return set.stream().mapToInt(Integer::intValue).toArray();
	}

}
