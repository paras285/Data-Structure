package com.leetcode.topInterviewQuestions;

import java.util.LinkedList;
import java.util.Queue;

/*
 * This is varient of Rotten-Orange
 * https://leetcode.com/discuss/interview-question/411357/
 */
public class ZombieInMatrix {

	public static void main(String[] args) {
		int array[][] = new int[][] {
			{0, 1, 1, 0, 1},
			{0, 1, 0, 1, 0},
			{0, 0, 0, 0, 1},
			{0, 1, 0, 0, 0}};
		timeTaken(array);
	}

	private static void timeTaken(int[][] array) {
		Queue<Index> queue = new LinkedList<Index>();
		int total = 0,zombies = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total++;
				if (array[i][j] == 1) {
					zombies++;
					queue.add(new Index(i, j));
				}
			}
		}
		System.out.println(queue.size());
		int time = 0;
		while (!queue.isEmpty()) {
			if(total == zombies){
				return;
			}
			for(int i = 0; i<queue.size(); i++){
				Index index = queue.poll();
				if(index.rowIndex-1>=0 && 
						array[index.rowIndex-1][index.colIndex] == 0){
					array[index.rowIndex-1][index.colIndex] = 1;
					zombies++;
					queue.add(new Index(index.rowIndex-1,index.colIndex));
				}
				if(index.rowIndex+1<array.length && 
						array[index.rowIndex+1][index.colIndex] == 0){
					array[index.rowIndex+1][index.colIndex] = 1;
					zombies++;
					queue.add(new Index(index.rowIndex+1,index.colIndex));
				}
				if(index.colIndex-1>=0 && 
						array[index.rowIndex][index.colIndex-1] == 0){
					array[index.rowIndex][index.colIndex-1] = 1;
					zombies++;
					queue.add(new Index(index.rowIndex,index.colIndex-1));
				}
				if(index.colIndex+1 < array[index.rowIndex].length && 
						array[index.rowIndex][index.colIndex+1] == 0){
					array[index.rowIndex][index.colIndex+1] = 1;
					zombies++;
					queue.add(new Index(index.rowIndex,index.colIndex+1));
				}
			}
			time++;
		}
		System.out.println(time);
	}
}

class Index {
	int rowIndex;
	int colIndex;

	public Index(int rowIndex, int colIndex) {
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}

}