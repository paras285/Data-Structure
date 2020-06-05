package com.leetcode.arrays.insertion;
//Leetcode-88
public class MergeSortedArray {
	public static void main(String args[]){
		int array1[] = new int[]{0};
		int array2[] = new int[]{1};
		//Here M and N are number of characters present other than 0
		int m=0,n=1;
		int index = array1.length-1;
		while(index>=0){
			if(n<0){
				array1[index] = array1[m--];
			}else if(m<0){
				array1[index] = array1[n--];
			}else if(array1[m]>array2[n]){
					array1[index] = array1[m--];
			}else if(array1[m]<=array2[n]){
					array1[index] = array2[n--];
			}
			index--;
		}
		for(int arr:array1){
			System.out.println(arr);
		}
	}

}
