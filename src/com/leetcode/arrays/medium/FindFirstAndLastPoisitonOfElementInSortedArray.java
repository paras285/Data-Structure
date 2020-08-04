package com.leetcode.arrays.medium;
/*
 * Leetcode Problem 34 (Medium)
 */
public class FindFirstAndLastPoisitonOfElementInSortedArray {

	public static void main(String[] args) {
		int array[] = new int[]{5,7,7,8,8,10};
		int element  =8;
		findFirstAndLastPosition(array,element);
		findFirstAndLastPositionUsingBinarySearch(array,element);
	}
	/*
	 * This approach takes O(n) because linear search, We can improve it using Binary Search
	 */
	private static void findFirstAndLastPosition(int[] array,int element) {
		int firstPosition = Integer.MIN_VALUE, lastPosition = Integer.MIN_VALUE;
		for(int index = 0; index<array.length; index++){
			if(array[index] == element && firstPosition != Integer.MIN_VALUE){
				lastPosition = index;
			}else if(array[index] == element){
				firstPosition = lastPosition = index;
			}
		}
		System.out.println(firstPosition+" "+lastPosition);
	}
	/*
	 * This approach is based on Binary Search, where we are finding the first and lastPosition of the element
	 * using two implementation of binary search
	 */
	private static int[] findFirstAndLastPositionUsingBinarySearch(int[] array,int element) {
//		Computing First Index
		int first = 0, last = array.length-1;
		int firstIndex  = -1;
		while(first<= last){
			int mid = first + (last-first)/2;
			if(array[mid] >= element){
				last = mid-1;
			}else{
				first = mid+1;
			}
			if(array[mid] == element){
				firstIndex = mid;
			}
		}
		System.out.println("First Index is: "+firstIndex);
//		Computing Last Index
		first = 0;
		last = array.length-1;
		int lastIndex  = -1;
		while(first<= last){
			int mid = first + (last-first)/2;
			if(array[mid] <= element){
				first = mid+1;
			}else{
				last = mid-1;
			}
			if(array[mid] == element){
				lastIndex = mid;
			}
		}
		System.out.println("Last Index is: "+lastIndex);
		return new int[]{firstIndex,lastIndex};
	}
	
}
