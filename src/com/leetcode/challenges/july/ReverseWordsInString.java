package com.leetcode.challenges.july;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3391/
 */
public class ReverseWordsInString {
	public static void main(String[] args) {
		String text = "   Hello    Paras   ";
//		reverseString(text);
		reverseStringbetterWay(text);
	}

	private static void reverseStringbetterWay(String text) {
		String[] stringArray = text.trim().split(" ");
		System.out.println(Arrays.toString(stringArray));
		int left = 0, right = stringArray.length-1;
		while(left<right){
			while(stringArray[left].length() == 0){
				left++;
			}
			while(stringArray[right].length() == 0){
				right--;
			}
			String leftString = stringArray[left];
			String rightString = stringArray[right];
			String tempString = leftString;
			leftString = rightString;
			rightString = tempString;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(stringArray));
	}

	private static void reverseString(String text) {
		Queue<String> queue = new LinkedList<String>();
		String[] stringArray = text.trim().split("\\s");
		for(String string:stringArray){
			if(string.length()!= 0){
				queue.add(string);
			}
		}
		StringBuffer buffer = new StringBuffer();
		while(!queue.isEmpty()){
			buffer.append(queue.poll());
		}
		System.out.println("_"+buffer.toString()+"_");
	}
}
