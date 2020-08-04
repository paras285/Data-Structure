package com.leetcode.arrays.easy;
/*
 * Leetcode-1029
 * We want to minimise the sum i.e. Maximumize the Profit
 * Cost of A - Cost of B --> Profit if person goes to A than B
 * Compare all and Sort them, store them in max-heap
 * Then first n/2 will to A and then other n/2 to B
 */
public class TwoCitiesScheduling {

	public static void main(String[] args) {
		int [][]costs = new int[][]{{10,20},{30,200},{400,50},{30,20}};
		int sum = 0;
		for(int[] cost:costs){
			sum = sum+Math.min(cost[0], cost[1]);
		}
		System.out.println("Sum is: "+sum);
	}

}
