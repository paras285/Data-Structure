package com.leetcode.topInterviewQuestions.Array;

import java.util.HashMap;
import java.util.Map;
/*
 * Not working
 */
public class ContigousSubArray {

	public static void main(String[] args) {
		int array[] = new int[]{0,1,1,0,1,1,1,0};
		findMaxSubArray(array);
	}

	private static int findMaxSubArray(int[] array) {
		int globalLength = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int index = 0; index<array.length; index++){
			if(array[index] == 0 ||array[index] ==1){
				if(map.containsKey(array[index])){
					map.put(array[index], map.get(array[index])+1);
				}else{
					map.put(array[index], 1);
				}
			}else{
				map.clear();
			}
			int localMaxLengthMinimum = Math.min(
					map.get(0)== null?0:map.get(0),
							map.get(1)== null?0:map.get(1));
			globalLength = Math.max(2*localMaxLengthMinimum, globalLength);
		}
		return globalLength;
	}

}
