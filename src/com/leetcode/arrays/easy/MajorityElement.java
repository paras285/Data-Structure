package com.leetcode.arrays.easy;
/*Leetcode-169
 * This problem is based on Moore`s Voting algorithm. It checks for the majority element in an array
 * As per this algorithm, we will consider the element at 0th index to be our majority element
 * Then iterate over the array. 
 * If next element is same as majority element then we will increment the count. Else decrement the count
 * If at anytime count becomes 0, we will change the Majority Element to current Index value 
 * and continune the process till we reach the last of array
 * NOTE: This algorithm always returns a element,
 * After that element is returned, we have to verify whether that element is majority or not
 * Majority means, it is greater than (n/2)
 * 
 * NOTE: In this problem we are just evaluating the candidate because that can be the only majorityElement(if exist)
 * Since, it is mentioned that there is definitely going to be the majorityElement we are simply returning the candidate
 */
public class MajorityElement {

	public static void main(String[] args) {
			int array[] = new int[]{3,3,2,3,4};
			System.out.println(majorityElement(array));
	}

	private static int majorityElement(int[] array) {
		int majorityElementCandidate  = array[0],count=1;
		for(int index=1; index<array.length; index++){
			if(array[index] == majorityElementCandidate){
				count++;
			}else{
				count--;
			}
			if(count == 0){
				majorityElementCandidate = array[index];
				count=1;
			}
		}
		return majorityElementCandidate;
		
	}

}
