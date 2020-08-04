package com.leetcode.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithKDifferentIntegers {

	public static void main(String[] args) {
		int array[] = new int[]{1,2,1,2,3};
		subarraysWithKDistinct(array,2);
	}

	private static void subarraysWithKDistinct(int[] array, int k) {
		Map<Integer,Integer> map = new HashMap<>();
		int count = 0;
		int startIndex = 0;
		for(int index = 0 ; index<array.length; index++){
			int value = (map.get(array[index]) == null)?0:map.get(array[index]);
			if(value != 0){
				map.put(array[index], value+1);
			}else{
				map.put(array[index], 1);
			}
			
			while(map.size()>k){
				int val =  map.get(array[startIndex]);
				if(val == 1){
					map.remove(array[startIndex]);
				}else{
					map.put(array[startIndex], val-1);
				}
				startIndex++;
				if(map.size() ==k){
					break;
				}
				count++;
			}
			if(map.size() == k)
			{
			count++;
			}
		}
		System.out.println(count);
		
	}

}
