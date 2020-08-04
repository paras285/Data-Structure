package com.leetcode.slidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class LongestRepeatingCharacterReplacement {
	public static void main(String[] args) {
		String s = "";
		int k = 1;
		characterReplacement(s,k);
	}

	private static void characterReplacement(String s, int k) {
		char word[] = s.toCharArray();
		Deque<Character> queue = new LinkedList<Character>();
		int count = 0;
		int startIndex = 0;
		queue.add(word[0]);
		for(int index = 0; index<s.length(); index++){
			if(word[index]!=queue.peekFirst()){
			count++;
			}
			while(count>k){
				int key = queue.pollFirst();
			}
		}
	}
}
