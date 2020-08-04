package com.leetcode.topInterviewQuestions.Array;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Leetcode-239 (Hard)
 * @author Paras
 *
 */
public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int array[] = new int[]{1,3,-1,-3,5,3,6,7};
		slidingWindowMaximum(array);
	}

	private static void slidingWindowMaximum(int[] array) {
		Deque<Integer> list = new LinkedList<>();
		int k=3;
		int maxArray[] = new int[array.length-k+1];
		int maxArrayIndex = 0;
		for(int index = 0; index<array.length; index++){
			while(!list.isEmpty() && list.peek() < index - k+1){
				list.poll();
			}
			while(!list.isEmpty() && array[list.peekLast()]<array[index]){
				list.poll();
			}
			list.offer(index);
			if(index>= k-1){
				maxArray[maxArrayIndex++] = array[list.peek()];
			}
	}
		for(int index= 0; index<maxArrayIndex; index++){
			System.out.println(maxArray[index]);
		}
	}
}
