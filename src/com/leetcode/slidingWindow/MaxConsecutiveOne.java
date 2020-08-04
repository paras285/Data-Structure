package com.leetcode.slidingWindow;
/*
 * Leetcode-1004
 */
public class MaxConsecutiveOne {
public static void main(String[] args) {
	int array[] = new int[]{1,1,1,0,0,0,1,1,1,1,0};
	maxConsecutive(array,2);
}

private static void maxConsecutive(int[] array, int k) {
	int start = 0;
	int count = 0;
	int maxCount = 0;
	for(int endIndex = 0; endIndex<array.length; endIndex++){
		if(array[endIndex] == 0){
			count++;
		}
		while(count>k){
			if(array[start] == 0){
				count--;
			}
			start++;
		}
		maxCount = Math.max((endIndex-start+1), maxCount);
	}
	System.out.println(maxCount);
}
}
