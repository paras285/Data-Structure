package com.leetcode.topInterviewQuestions.Array;

/*
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/800/
 * This is solved Using Heapify
 */
public class KLargestElementInArray {
	private static int array[] ;
	private static int size = 0;
	static int[] tempArray;
	public static void main(String[] args) {
		array = new int[]{3,2,1,5,6,4};
		size = array.length;
		kLargestElement(array,2);
	}

	private static void kLargestElement(int[] array, int i) {
		for(int index = (array.length-1)/2; index>=0; index--){
			shiftDown(index);
		}
//		printArray(array);
		tempArray = array.clone();
		int number = 0;
		while(i!=0){
			 number = extractMax();
			i--;
		}
		System.out.println(number);
	}
	private static int extractMax() {
		int tempNumber = tempArray[0];
		tempArray[0] = tempArray[size-1];
		size--;
		shiftDown(0);
		return tempNumber;
	}

	private static void printArray(int[] array) {
		for(int outerIndex = 0; outerIndex<array.length;outerIndex++){
				System.out.print(array[outerIndex]);
			}
	}
	private static void shiftDown(int index) {
		int minIndex = index;
		int leftIndex = 2*index+1;
		int rightIndex = 2*index+2;
		if(leftIndex<= size-1 && array[leftIndex]>array[minIndex]){
			minIndex  = leftIndex;
		}
		if(rightIndex<= size-1 && array[rightIndex] > array[minIndex]){
			minIndex = rightIndex;
		}
		if(index!=minIndex){
			int temp = array[index];
			array[index]  = array[minIndex];
			array[minIndex] =  temp;
			shiftDown(minIndex);
		}
	}
}
