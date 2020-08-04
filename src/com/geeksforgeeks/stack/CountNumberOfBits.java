package com.geeksforgeeks.stack;

public class CountNumberOfBits {
	public static void main(String[] args) {
		int a = 20^30;
		int count = 0;
		while(a!=0){
			int value = a&1;
			if(value==1){
				count++;
			}
			a = a>>1;
		}
		System.out.println(count);
	}
}
