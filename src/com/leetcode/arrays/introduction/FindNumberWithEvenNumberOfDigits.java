package com.leetcode.arrays.introduction;
//Leetcode-1295
public class FindNumberWithEvenNumberOfDigits {
	public static void main(String args[]){
		int array[] = new int[]{12,345,2,6,7896};
		int count = findNumbers(array);
		System.out.println(count);
	}

	private static int findNumbers(int[] array) {
		int count = 0;
		for(int index=0; index<array.length; index++){
			boolean isEven = countNumberOfDigits(array[index]);
			if(isEven){
				count++;
			}
		}
		return count;
	}

	private static boolean countNumberOfDigits(int number) {
		int count = 0;
		while(number>0){
			count++;
			number = number/10;
		}
		return (count%2 == 0)?true:false;
	}
}
