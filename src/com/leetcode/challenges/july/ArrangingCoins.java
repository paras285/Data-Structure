package com.leetcode.challenges.july;
/*
 * Leetcode-441
 * To-Do (Read the solution but do it after few days to if you remember the concept)
 * The algorithm is based on Binary Search approach (Tricky Approach)
 * As we observe it is leading to sum of elements <= n
 * So we check left<right, then find its middle and assuming that is the number of steps
 * We check whether that is == number or increment or decrement accordingly
 */
public class ArrangingCoins {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(arrangeCoins(num));
	}

	private static int arrangeCoins(int num) {
		long left = 0, right = num;
		long mid,sum;
		while(left<=right){
			mid = left + (right-left)/2;
			sum = mid*(mid+1)/2;
			if(sum == num){
				return (int)mid;
			}
			if(num<sum){
				right = mid-1;
			}else{
				left = mid+1;
			}
		}
		return (int)right;
		}

}
