package com.leetcode.arrays.deleting;
/**
 * 
 * @author Paras
 *	We are given input array having values from [1-n] where  some numbers appears twice, and some only once.
 *	We have to find the elements that are duplicate
 *	Approach: Input --> [4,3,2,7,8,2,3,1] Output --> [3,2]
 *	We will be considering numbers as indexes. For each number found we will be marking its index-1 as negative
 *	If we again get to some index which is having that value as negative, that means that is duplicate
 *	Example: 4 (its index-1 i.e 3, so element at 4 we will be marking as negative)
 *	3 (its index-1 i.e 2, so element at 4 we will be marking as negative)
 *	4 (its index-1 i.e 3, so element at 4 we will be marking as negative)
 *	So till now array will look like [4,-3,-2,-7,8,2,3,1]
 *	Now when we will find another 2, we will try to negate its index (2-1) i.e. 1 as negative. which means it has already been visited.
 * 	So that is our duplicate. We will continue the process and find out in this manner
 */
public class RemoveDuplicate_Better {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
