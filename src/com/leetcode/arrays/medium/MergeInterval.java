package com.leetcode.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

	public static void main(String[] args) {
		int array[][] = new int[][]
				{
					{1,3},{2,6},
					{8,10},{15,18}
				};
		int[][] mergedArray = mergeInterval(array);
		for(int index = 0; index<mergedArray.length; index++){
			for(int j = 0; j<mergedArray.length; j++){
				System.out.print(mergedArray[index][j]+" ");
			}
			System.out.println("");
		}
	}

	private static int[][] mergeInterval(int[][] intervals) {
		if(intervals.length<=1){
			return intervals;
		}
		Arrays.sort(intervals, 
				(firstInterval,secondInterval) -> firstInterval[0]-secondInterval[0]);
		List<int[]> list = new ArrayList<>();
		int[] currentInterval = intervals[0];
		list.add(currentInterval);
		
		for(int[] interval:intervals){
			int currentInterval_end =  currentInterval[1];
			int nextElement_start = interval[0];
			int nextElement_end = interval[1];
			
			if(nextElement_start <= currentInterval_end){
				currentInterval[1] = Math.max(currentInterval_end, nextElement_end);
			}else{
				currentInterval = interval;
				list.add(currentInterval);
			}
		}
		return null;
//		return (int[][]) list.toArray();
	}

}