package com.leetcode.topInterviewQuestions.Array;

import java.util.Arrays;

public class GameOfLife {
	public static void main(String[] args) {
		int board[][] = new int[][] {{0,1,0},{0,0,1},{1,1,1},{0,1,0}};
		gameOfLife(board);
	}

	private static void gameOfLife(int[][] board) {
		for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {
			for (int colIndex = 0; colIndex < board[rowIndex].length; colIndex++) {
				int live = 0;
				// Checking next row element
				System.out.println("\n"+rowIndex+" "+colIndex+"\n");
				
				System.out.print(" "+(rowIndex + 1)+" "+colIndex);
				if (rowIndex + 1 < board.length && board[rowIndex + 1][colIndex] == 1) {
					live++;
				}
				// Checking previous row element
				System.out.print(" "+(rowIndex - 1)+" "+colIndex);
				if (rowIndex - 1 >= 0 && board[rowIndex - 1][colIndex] == 1) {
					live++;
				}
				// Checking next Column element
				System.out.print(" "+(rowIndex)+" "+(colIndex+1));
				if (colIndex + 1 < board[rowIndex].length && board[rowIndex][colIndex + 1] == 1) {
					live++;
				}
				// Checking previous Column element
				System.out.print(" "+rowIndex+" "+(colIndex-1));
				if (colIndex - 1 >= 0 && board[rowIndex][colIndex - 1] == 1) {
					live++;
				}
				System.out.print(" "+(rowIndex+1)+" "+(colIndex+1));
				if (rowIndex + 1 < board.length && colIndex + 1 < board[rowIndex].length
						&& board[rowIndex + 1][colIndex + 1] == 1) {
					live++;
				}
				System.out.print(" "+(rowIndex+1)+" "+(colIndex-1));
				if (rowIndex + 1 < board.length && colIndex - 1 >= 0 
						&& board[rowIndex + 1][colIndex - 1] == 1) {
					live++;
				}
				System.out.print(" "+(rowIndex-1)+" "+(colIndex+1));
				if (rowIndex - 1 >= 0 && colIndex + 1 < board[rowIndex].length
						&& board[rowIndex - 1][colIndex + 1] == 1) {
					live++;
				}
				System.out.print(" "+(rowIndex-1)+" "+(colIndex-1));
				if (rowIndex - 1 >= 0 && colIndex - 1 >= 0 && board[rowIndex - 1][colIndex - 1] == 1) {
					live++;
				}
				if(live == 2 || live == 3){
					board[rowIndex][colIndex] =1 ;
				}else{
					board[rowIndex][colIndex] =0 ;
				}
			}
		}
		for(int index = 0; index<board.length; index++){
			for(int jIndex = 0; jIndex<board[index].length; jIndex++){
				System.out.print(board[index][jIndex]+" ");
			}
			System.out.println("");
		}
	}
}
