package com.leetcode.topInterviewQuestions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
	public static void main(String args[]){
		int array1[] = new int[]{4,9,5};
		int array2[] = new int[]{9,4,9,8,4};
		findIntersectedArray(array1,array2);
	}

	private static void findIntersectedArray(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		int length1 = array1.length, length2 = array2.length;
		List<Integer> list = new ArrayList<>();
		int index1 = 0,index2 = 0;
		while(index1<length1 && index2 <length2){
			if(array1[index1] ==array2[index2]){
				list.add(array1[index1]);
				index1++;
				index2++;
			}else if(array1[index1] > array2[index2]){
				index2++;
			}else{
				index1++;
			}
		}
		
		int newArray[] = new int[list.size()];
		for(int index = 0; index<list.size(); index++){
			newArray[index] = list.get(index);
		}
		for(int i:newArray){
			System.out.println(i);
		}
		
	}
}
