package com.leetcode.arrays.medium;
/* Leetcode-11
 *	This problem has 2 solutions, 1) Brute force approach where we will have nested loop and compare each value and
 *	evaluate if it is max or not and replace it. It takes O(n2)
 *  Another approach is using left and right pointer, Compare the height both and find the minimum of both
 *  Difference between those two pointers along with the minimum bar that will be the water that can be stored 
 *  in the container. We will keep on doing it and try to move next from minimum bar to next bar
 */
public class ContainerWithMostWater {
	public static void main(String args[]){
		int array[] = new int[]{1,8,6,2,5,4,8,3,7};
		containerWithMostWaterUsingFirstApproach(array);
		containerWithMostWaterUsingSecondApproach(array);
	}

	private static void containerWithMostWaterUsingFirstApproach(int[] array) {
		int max = Integer.MIN_VALUE, length = array.length;
		for(int index=0; index<length; index++){
			for(int innerIndex = index+1; innerIndex<length; innerIndex++){
				int waterStored = Math.min(array[index],array[innerIndex])*(innerIndex-index);
				max = Math.max(max, waterStored);
			}
		}
		System.out.println(max);
	}
	
	private static void containerWithMostWaterUsingSecondApproach(int[] array) {
		int left = 0, right = array.length-1;
		int max = Integer.MIN_VALUE;
		while(left<right){
			int waterStored = Math.min(array[left],array[right])*(right-left);
			max = Math.max(max, waterStored);
			if(array[left]<array[right]){
				left++;
			}else{
				right--;
			}
		}
		System.out.println(max);
	}
}
