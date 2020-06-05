package com.leetcode.arrays.inPlace;
//Leetcode-977
public class SquaresofaSortedArray {

	public static void main(String[] args) {
		int array[] = new int[]{-4,-1,0,3,10};
		squareArray(array);
	}

	private static void squareArray(int[] array) {int start = 0,end = array.length-1,tempIndex= array.length-1;
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
	
}

}
