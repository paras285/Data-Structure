package com.leetcode.topInterviewQuestions;

public class ClimbingLadders {

	static int total  =0;
	public static void main(String[] args) {
		System.out.println(number_ways(5));
		System.out.println(number_ways_bottoms_up(5));
	}
	private static int number_ways(int number) {
		if(number == 0){
			return 1;
		}
		if(number<0){
			return 0;
		}
		return number_ways(number-1)+number_ways(number-2);
	}
	
	private static int number_ways_bottoms_up(int number){
		if(number == 0 || number == 1){
			return 1;
		}
		int nums[] = new int[number+1];
		nums[0] = 1;
		nums[1] = 1;
		int total = 0;
		for(int index = 2; index<number-1; index++){
			total = total+ nums[index-1]+nums[index-2];
		}
		return total;
	}

}
