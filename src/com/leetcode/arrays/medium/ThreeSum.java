package com.leetcode.arrays.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 *	Leetcode-15
 */
public class ThreeSum {

	public static void main(String args[]){
		int array[] = new int[]{-1, -2,3};
//		int element  = 5;
//		findElements(array,0);
		findElementUsingTwoPointers(array);
		}

	private static void findElementUsingTwoPointers(int[] array) {
		List<List<Integer>> list = new LinkedList<>();
		Arrays.sort(array);
		for(int index = 0; index<array.length-2; index++){
			int firstElement = array[index];
			int secondElement = index+1, thirdElement = array.length-1;
			while(secondElement<thirdElement){
				
				int sum = firstElement + array[secondElement] + array[thirdElement];
				if(sum==0){
					list.add(Arrays.asList(firstElement,array[secondElement],array[thirdElement]));
					System.out.println(firstElement+" "+array[secondElement]+" "+array[thirdElement]);
					break;
				}else if(sum>0){
					thirdElement--;
				}else{
					secondElement++;
				}
			}
		}
	}

	/*private static void findElements(int[] array, int element) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int outerIndex = 0; outerIndex<array.length; outerIndex++){
			int fixedElement = array[outerIndex];
			map.clear();
			for(int index = 0; index<array.length; index++){
				if(index == outerIndex){
					continue;
				}
				int tempSum = fixedElement + array[index];
				if(map.containsKey(-tempSum)){
					System.out.println(fixedElement+ " "+array[index]+" "+(-tempSum));
					break;
				}else{
					map.put(array[index],index);
				}
			}
		}
		
	}
*/}
