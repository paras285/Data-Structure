package com.geeksforgeeks.stack;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfSubArrayK_Practice {
	public static void main(String[] args) {
		int array[] = new int[]{9,9,1,3,2,6,9};
		int k =3;
		maximumOfSubArrayK(array,k);
	}

	private static void maximumOfSubArrayK(int[] array, int k) {
		Deque<Integer> list = new LinkedList<Integer>();
		int maxArray[] = new int[array.length-k+1];
		int maxArrayIndex = 0;
		for(int index = 0; index<array.length; index++){
			while(!list.isEmpty() && list.peek()<index-k+1){
				list.pollFirst();
			}
			while(!list.isEmpty() && array[list.peekLast()] < array[index]){
				list.pollLast();
			}
			list.offer(index);
			if(index>=k-1){
				maxArray[maxArrayIndex++] = array[list.peek()];
			}
		}
		for(int index = 0; index<maxArrayIndex; index++){
			System.out.print(maxArray[index]+" ");
		}
	}
}
