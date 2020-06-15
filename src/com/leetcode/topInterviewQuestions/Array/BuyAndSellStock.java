package com.leetcode.topInterviewQuestions.Array;

public class BuyAndSellStock {
	public static void main(String[] args) {
		int array[] = new int[]{7,6,4,3,1};
		maxProfit(array);
	}
	
	public static int maxProfit(int[] array){
		int maxProfit = 0;
		for(int index = 1; index<array.length; index++){
			if(array[index] > array[index-1]){
				maxProfit = maxProfit + (array[index] - array[index-1]);
			}
		}
		return maxProfit;
	}
}
