package com.leetcode.slidingWindow;
/*
 * Failed for test-case [84,-37,32,40,95] --> 167
 * Output --> 5 Expected --> 3
 */
public class ShortestSubArrayWithSumAtleastK {
	public static void main(String[] args) {
		int array[] = new int[] {84,-37,32,40,95};
		int k = 167;
		System.out.println(shortestSubarray(array, k));
	}

	private static int shortestSubarray(int[] array, int k) {
		if(array.length == 0) return -1;
		int currentSum = array[0];
		if(currentSum == k) return 1;
		int minimum = Integer.MAX_VALUE;
		int startIndex = 0;
		for(int index =1; index<array.length; index++){
			currentSum = currentSum+array[index];
			while(currentSum>=k){
				currentSum =  currentSum - array[startIndex];
				minimum = Math.min(minimum, index-startIndex+1);
				startIndex++;
			}
		}
		return minimum;
	}
}
