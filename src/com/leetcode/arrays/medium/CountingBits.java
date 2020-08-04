package com.leetcode.arrays.medium;

import java.util.Arrays;

/*
 * Leetcode-338
 * Logic: 0 --> 000, 1--> 001 2--> 010 3--> 011 4--> 100
 * If we observer the above pattern 
 * for odd number it is, number of bits on dividing the number by 2+1
 * For even number, number of bits of dividing the number
 * Example: 4 --> Its binary represnetation is 100 , dividing the number by 2 is 2
 * whose binary representation is 010 (Equal number of bits)
 * 3 --> Binary Representation is 011, Dividing by 2  is 1 whose binary represnetation is 001
 * 1 more than number
 */
public class CountingBits {
	public static void main(String[] args) {
		int num = 0;
		countBits(num);
	}

	private static void countBits(int num) {
		int result[]  = new int[num+1];
		result[0] = 0;
		for(int index = 1; index<=num; index++){
			if(index%2!=0){
				result[index] = 1+result[index/2];
			}else{
				result[index] = result[index/2];
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
