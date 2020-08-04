package com.leetcode.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {
	public static void main(String[] args) {
		int tree[] = new int[]{3,3,3,1,2,1,1,2,3,3,4};
		totalFruit(tree);
	}

	private static void totalFruit(int[] tree) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int startIndex = 0;
		int maximum = 0;
		for(int index = 0; index<tree.length; index++){
			
			map.put(tree[index], (map.getOrDefault(tree[index],0)+1));
			while(map.size()>2){
				int value = map.get(tree[startIndex]);
					if(value == 1){
						map.remove(tree[startIndex]);
					}else{
						map.put(tree[startIndex], map.get(tree[startIndex])-1);
					}
					startIndex++;
			}
			maximum = Math.max(maximum, (index-startIndex+1));
		}
		System.out.println(maximum);
	}
 
}
