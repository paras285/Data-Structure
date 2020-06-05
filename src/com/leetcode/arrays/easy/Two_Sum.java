package com.leetcode.arrays.easy;

import java.util.HashMap;
import java.util.Map;
//Leetcode-1
public class Two_Sum {

	public static void main(String[] args) {
		int array[] = new int[]{2, 7, 11, 15,13};
		int target  = 171;
		twoSum(array,target);
	}

	private static int twoSum(int[] array, int target) {
		int result[] = new int[2];
		int length = array.length;
		Map<Integer,Integer> map = new HashMap<>(length);
		for(int index=0; index<length; index++){
			int remainder =  target - array[index];
			if(map.containsKey(remainder)){
				result[0] =  map.get(remainder);
				result[1] = index;
			}else{
				map.put(array[index],index);
			}
		}
		System.out.println(result[0]+ " "+result[1]);
		return 0;
	}

}
