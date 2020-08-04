package com.leetcode.arrays.medium;
/*
 * Leetcode-200
 */
public class Number_Of_Islands {
	public static void main(String[] args) {
		char grid[][] = new char[][] {{'1','1','0'},{'1','1','0'},{'0','0','1'}};
//		char[][] grid = new char[][] {{1,1}};
		System.out.println(numberOfIslands(grid));
	}

	private static int numberOfIslands(char[][] grid) {
		int numberOfIsland  = 0;
		for(int index = 0;index<grid.length; index++){
			for(int innerIndex = 0; innerIndex<grid[0].length; innerIndex++){
				if(grid[index][innerIndex] == '1'){
					numberOfIsland = numberOfIsland+1;
					grid[index][innerIndex] = '2';
					checkAdjacent(grid,index,innerIndex);
				}
			}
		}
		return numberOfIsland;
	}

	private static void checkAdjacent(char[][] array, int index, int innerIndex) {
		if(index-1>=0 && array[index-1][innerIndex] == '1'){
			array[index-1][innerIndex] = '2';
			checkAdjacent(array,index-1,innerIndex);
		}
		if(index+1<array.length && array[index+1][innerIndex] == '1'){
			array[index+1][innerIndex] = '2';
			checkAdjacent(array,index+1,innerIndex);
		}
		if(innerIndex-1>=0 && array[index][innerIndex-1] == '1'){
			array[index][innerIndex-1] = '2';
			checkAdjacent(array,index,innerIndex-1);
		}
		if(innerIndex+1<array[0].length && array[index][innerIndex+1] == '1'){
			array[index][innerIndex+1] = '2';
			checkAdjacent(array,index,innerIndex+1);
		}
	}
}
