package com.leetcode.arrays.introduction;
//Leetcode-977
public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int array[] = new int[]{-7,-3,2,3,11};
		array = sortedSquares(array);
		for(int index = 0; index<array.length; index++){
			System.out.println(array[index]);
		}
	}
	
	public static int[] sortedSquares(int[] array) {
		/**
		 * First Approach --> In this we are squaring each number and using inbuild function to sort the array
		 */
		/*for(int index = 0; index<array.length; index++){
			array[index]*=array[index];
		}
		Arrays.sort(array);*/
		/**
		 * Second approach
		 */
		/*int start = 0,end = array.length-1,tempIndex= array.length-1;
		int tempArray[] = new int[array.length];
		
		while(start<=end){
			if(Math.abs(array[start])<Math.abs(array[end])){
				tempArray[tempIndex--] = array[end]*array[end];
				end--;
			}else{
				tempArray[tempIndex--] = array[start]*array[start];
				start++;
			}
		}
		
		return tempArray;*/
		int left = 0,right = array.length-1;
		while(left<right){
			if(Math.abs(array[left])> Math.abs(array[right])){
				int temp = array[right];
				int product = array[left] * array[left];
				array[right--] = product;
				array[left] = temp;
			}else{
				int product = array[right] * array[right];
				array[right--] = product;
			}
		}
		return array;
        
    }
}
