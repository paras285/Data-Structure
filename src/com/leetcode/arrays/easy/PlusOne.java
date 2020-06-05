package com.leetcode.arrays.easy;
//Leetcode-66
public class PlusOne {
	public static void main(String args[]){
		int number[] = new int[]{9};
		int tempArray[] = plusOneToInteger(number);
		for(int index=0; index<tempArray.length; index++){
			System.out.print(tempArray[index]);
		}
	}

	private static int[] plusOneToInteger(int[] array) {
		int carry = 1;
		for(int index=array.length-1; index>=0; index--){
			if(array[index] == 9){
				array[index] =0;
		}else{
			int number = array[index]+carry;
			if(number%10 !=0){
				array[index] = number;
				carry =0;
				break;
			}
		}
	}
		if(carry!=0){
			int newArray[] = new int[array.length+1];
			newArray[0] = 1;
			for(int index=1; index<array.length; index++){
				newArray[index] = 0;
			}
			return newArray;
		}
			return array;
		}
}
