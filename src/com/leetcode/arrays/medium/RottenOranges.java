package com.leetcode.arrays.medium;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Leetcode -994
 */
public class RottenOranges {

	public static void main(String[] args) {
		int array[][] = new int[][]{{1},{2},{0},{1},{0},{2}};
//		int array[][] = new int[][]{{0,2}};
		System.out.println(rottenOranges(array));
	}

	private static int rottenOranges(int[][] array) {
		Queue<Node> queue = new LinkedList<Node>();
		int totalOranges = 0;
		int rottenOranges = 0;
		for(int i = 0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++){
				if(array[i][j] ==1 || array[i][j] ==2){
					totalOranges = totalOranges+1;
				}
				if(array[i][j] ==2){
					rottenOranges = rottenOranges+1;
					queue.add(new Node(i,j));
					
				}
			}
		}
		if(totalOranges == rottenOranges){
			System.out.println("Time taken 0 as all are rotten oranges");
			return 0;
		}
		int time = -1;
		while(!queue.isEmpty()){
			int size = queue.size();
			time++;
			for(int index = 0; index<size; index++){
				Node node = queue.poll();
				if(node.firstIndex+1<array.length && array[node.firstIndex+1][node.secondIndex] == 1){
					array[node.firstIndex+1][node.secondIndex] = 2;
					rottenOranges = rottenOranges+1;
					queue.add(new Node(node.firstIndex+1, node.secondIndex));
				}
				if(node.firstIndex-1 >= 0 && array[node.firstIndex-1][node.secondIndex] == 1){
					array[node.firstIndex-1][node.secondIndex] = 2;
					rottenOranges = rottenOranges+1;
					queue.add(new Node(node.firstIndex-1, node.secondIndex));
				}
				if(node.secondIndex+1<array[0].length && array[node.firstIndex][node.secondIndex+1] == 1){
					array[node.firstIndex][node.secondIndex+1] = 2;
					rottenOranges = rottenOranges+1;
					queue.add(new Node(node.firstIndex, node.secondIndex+1));
				}
				if(node.secondIndex-1 >= 0 && array[node.firstIndex][node.secondIndex-1] == 1){
					array[node.firstIndex][node.secondIndex-1] = 2;
					rottenOranges = rottenOranges+1;
					queue.add(new Node(node.firstIndex, node.secondIndex-1));
				}
			}
		}
		if(totalOranges!=rottenOranges){
			System.out.println("-1");
			return -1;
		}
		return time;
	}
}

class Node{
	int firstIndex;
	int secondIndex;

	public Node(int firstIndex, int secondIndex) {
		this.firstIndex = firstIndex;
		this.secondIndex = secondIndex;
	}
	
	
}
