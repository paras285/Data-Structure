package com.leetcode.topInterviewQuestions.Array;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		String array = "pwwkew";
		maxLength(array);
	}

	private static void maxLength(String array) {
		int i=0,j=0,size = array.length()-1;
		int maxSize  =0;
		HashSet<Character> set = new HashSet<>();
		while(i<= size && j<=size){
			if(!set.contains(array.charAt(j))){
				set.add(array.charAt(j++));
				maxSize = Math.max(maxSize, (j-i));
			}else{
				set.remove(array.charAt(i++));
			}
		}
		System.out.println(maxSize);
	}

}
