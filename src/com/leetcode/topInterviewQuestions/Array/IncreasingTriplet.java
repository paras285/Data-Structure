package com.leetcode.topInterviewQuestions.Array;

public class IncreasingTriplet {

	public static void main(String[] args) {
		int array[] = new int[]{1,2,2,1,3};
		isIncreasing(array);
	}

	private static boolean isIncreasing(int[] array) {
		int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE, largest = Integer.MAX_VALUE;
		for(int i:array){
			if(i<= small){
				small = i;
			}else if(i>small && i<= big){
				big = i;
			}else if(i> big){
				largest =  i;
				break;
			}
		}
		System.out.println(small+" "+big+" "+largest);
		return false;
	}

}
