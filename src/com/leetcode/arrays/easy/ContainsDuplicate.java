package com.leetcode.arrays.easy;

import java.util.HashSet;
//Leetcode-217
public class ContainsDuplicate {

	public static void main(String[] args) {
		int array[] = new int[]{};
		System.out.println(containsDuplicate(array));
		}

	private static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>(nums.length);
        for(int index=0; index<nums.length; index++){
            if(set.contains(nums[index])){
                return true;
            }else{
                set.add(nums[index]);
            }
        }
        return false;
   
	}

}
