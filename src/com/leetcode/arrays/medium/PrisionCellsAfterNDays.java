package com.leetcode.arrays.medium;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrisionCellsAfterNDays {

	public static void main(String[] args) {
		int cells[] = new int[]{0,1,0,1,1,0,0,1};
		int n = 7;
		prisonAfterNDays(cells,n);
	}

	private static void prisonAfterNDays(int[] cells, int n) {
//		Map<Integer,int[]> cellMap = new HashMap<Integer, int[]>();
		Set<int[]> set = new LinkedHashSet<>(); 
		boolean hasCycle = false;
		int resultArray[] = new int[cells.length];
		int cycle = 0;
		while(n>0){
			int []result = new int[cells.length];
			result[0] = result[cells.length-1] = 0;
			for(int index = 1; index<cells.length-1; index++){
				if((cells[index-1] == 0 && cells[index+1] == 0) || 
						(cells[index-1] == 1 && cells[index+1] == 1)){
					result[index] = 1;
				}else{
					result[index] = 0;
				}
				cells = result;
			}
			if(set.contains(result)){
				hasCycle = true;
			}else{
				set.add(result);
				cycle++;
			}
			n--;
		}
		if(hasCycle){
		/*	for(int index = 0; index<cycle%n; index++){
				if(set.)
			}*/
		}
		/*while(n>0){
			int []result = new int[8];
			result[0] = result[7] = 0;
			if(n%64>0){
				cellMap.put(n, cellMap.get(n%64));
			}else{
				for(int index=1; index<cells.length-1; index++){
					if((cells[index-1] == 0 && cells[index+1] == 0) || 
							(cells[index-1] == 1 && cells[index+1] == 1)){
						result[index] = 1;
					}else{
						result[index] = 0;
					}
				}	
			}
			cells= result;
			n--;
		}*/
		System.out.println(Arrays.toString(cells));
	}

}
