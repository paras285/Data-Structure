package com.leetcode.arrays.easy;
/*
 * Leetcode-1232
 */
public class CheckIfStraightLine {

	public static void main(String[] args) {
		/*int [][]coordinates = new int[][]{{-2,-1},{2,3},{3,4},
			{4,5},{5,6},{6,7}};
		System.out.println(checkStraightLine(coordinates));*/
		
	}

	private static boolean checkStraightLine(int[][] coordinates) {
		boolean isStraight = true;
		int difference =  Math.abs(coordinates[0][1]-coordinates[0][0]);
		for(int[] coordinate:coordinates){
			if(difference != (coordinate[1]-coordinate[0])){
				isStraight =  false;
				
			}
		}
		return true;
	}

}
