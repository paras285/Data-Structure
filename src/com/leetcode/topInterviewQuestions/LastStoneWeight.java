package com.leetcode.topInterviewQuestions;

import java.util.PriorityQueue;
/*
 * Leetcode-1046
 * It could be implemented using LinkedList as well but in that case, it will be more time complex
 */
public class LastStoneWeight {

	public static void main(String[] args) {
		int stones[] = new int[]{0,0,0,0};
		lastStoneWeight(stones);
	}

	private static void lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> list = new PriorityQueue<>
				((Integer a,Integer b) -> b-a);
		for(int stone:stones){
			list.offer(stone);
		}
		while(list.size()>1){
			list.offer(list.poll() - list.poll());
		}
		System.out.println((list.size()==0)?0:list.poll());
	}

}
