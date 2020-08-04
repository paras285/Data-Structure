package com.leetcode.topInterviewQuestions.string.easy;

public class ReverseString {

	public static void main(String[] args) {
		char []string = new char[]{'h','e','l','l','o'};
		reverseString(string);
	}

	private static void reverseString(char[] string) {
		int start = 0,end = string.length-1;
		while(start<end){
			char temp = string[start];
			string[start] =  string[end];
			string[end] = temp;
			start++;
			end--;
		}
		System.out.println(string);
	}

}
