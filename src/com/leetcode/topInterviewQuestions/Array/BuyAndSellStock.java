package com.leetcode.topInterviewQuestions.Array;
/*
 * Leetcode-121
 */
public class BuyAndSellStock {
	public static void main(String[] args) {
		int array[] = new int[]{7,1,5,3,6,4};
//		maxProfit(array);
		maxProfitSingleTransaction(array);
	}
	
	private static void maxProfitSingleTransaction(int[] array) {
		if(array.length == 0){
			return ;
		}
		int minimum = array[0];
		int maximum = 0;
		for(int index =1 ; index<array.length; index++){
			if(array[index] >minimum){
				maximum = Math.max(maximum, array[index]-minimum);
			}else{
				minimum = array[index];
			}
		}
		System.out.println("Profit is "+((maximum-minimum)<0?0:(maximum-minimum)));
	}

	public static int maxProfit(int[] array){
		int maxProfit = 0;
		for(int index = 1; index<array.length; index++){
			if(array[index] > array[index-1]){
				maxProfit = maxProfit + (array[index] - array[index-1]);
			}
		}
		System.out.println(maxProfit);
		return maxProfit;
	}
}
