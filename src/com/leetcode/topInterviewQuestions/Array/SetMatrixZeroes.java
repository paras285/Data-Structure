package com.leetcode.topInterviewQuestions.Array;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		int array[][] = new int[][]{
			{1,1,1},{1,0,1},{1,1,1}
		};
//		int array[][] = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZero(array);
	}

	private static void setZero(int[][] array) {
		printArray(array);
		boolean firstFlag  = false;
		for(int row = 0; row<array.length; row++){
			if(array[row][0] == 0){
				firstFlag  = true;
			}
			for(int col=1; col<array[row].length;col++){
				
				if(array[row][col] == 0){
					array[0][col] = 0;
					array[row][0] = 0;
				}
			}
		}
		System.out.println("*************After first changes****************");
		printArray(array);
		for(int row = array.length-1; row>=0; row--){
			for(int col = array[row].length-1; col>=1; col--){
				if(array[0][col] == 0 || array[row][0] == 0){
					array[row][col] = 0;
				}
			}
		}
		System.out.println("*************After second changes****************");
		printArray(array);
		if(firstFlag){
			for(int index = 0; index<array.length; index++){
				array[index][0] = 0;
			}
		}
		System.out.println("*************After last changes****************");
		printArray(array);
	}

	/*private static void setZero(int[][] array) {
		printArray(array);
		boolean firstColumn = false;
			for(int outerIndex = 0; outerIndex<array.length;outerIndex++){
				if(array[outerIndex][0] == 0)
					firstColumn = true;
				for(int innerIndex=1; innerIndex<array.length;innerIndex++){
					if(array[outerIndex][innerIndex] == 0){
						array[outerIndex][0] = 0;
						array[0][innerIndex] = 0;
					}
					if(firstColumn == true){
						array[outerIndex][0] = 0;
					}
				}
			}
			System.out.println("*******");			
			printArray(array);
			System.out.println("*******");
			for(int outerIndex = array.length-1; outerIndex>=0; outerIndex--){
				for(int innerIndex = array.length-1; innerIndex>=1; innerIndex--){
					if(array[0][innerIndex] ==0 || array[outerIndex][0] == 0){
						array[outerIndex][innerIndex] = 0;
					}
				}
			}
		int col0 = 1, rows = array.length, cols = array[0].length;

	    for (int i = 0; i < rows; i++) {
	        if (array[i][0] == 0) col0 = 0;
	        for (int j = 1; j < cols; j++)
	            if (array[i][j] == 0)
	            	array[i][0] = array[0][j] = 0;
	    }

	    for (int i = rows - 1; i >= 0; i--) {
	        for (int j = cols - 1; j >= 1; j--)
	            if (array[i][0] == 0 || array[0][j] == 0)
	            	array[i][j] = 0;
	        if (col0 == 0) array[i][0] = 0;
	    }
		System.out.println("******************\n");
		printArray(array);
	}
*/
	private static void printArray(int[][] array) {
		for(int outerIndex = 0; outerIndex<array.length;outerIndex++){
			for(int innerIndex=0; innerIndex<array[outerIndex].length;innerIndex++){
				System.out.print(array[outerIndex][innerIndex]+"\t");
			}
			System.out.println("");
		}		
	}

}
