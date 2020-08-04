package com.leetcode.topInterviewQuestions;
/*
 * Leetcode-64
 */
public class MinimumPathSum {
	public static void main(String[] args) {
		int array[][] = new int[][]{{1,1,1},{1,1}};
		minPathSum(array);
	}

	private static void minPathSum(int[][] array) {
		int rowSize = array.length;
		if(rowSize == 0){
			return;
		}
		int colSize = array[0].length;
		int dynamicArray[][] = array.clone();
		for(int index = 1; index<rowSize; index++){
			dynamicArray[index][0] = dynamicArray[index][0]+array[index-1][0];
		}
		for(int index=1; index<colSize; index++){
			dynamicArray[0][index] = dynamicArray[0][index] + array[0][index-1];
		}
		for(int i=1; i<rowSize; i++){
			colSize = array[i].length;
			for(int j=1; j<colSize; j++){
				dynamicArray[i][j] = dynamicArray[i][j] + Math.min(array[i-1][j], array[i][j-1]);
			}
		}
		System.out.println(dynamicArray[rowSize-1][colSize-1]);
	}
}
// [[1,3,1],[1,5,1],[4,2,1]]
