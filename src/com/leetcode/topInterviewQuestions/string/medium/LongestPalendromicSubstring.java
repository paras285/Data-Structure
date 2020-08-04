package com.leetcode.topInterviewQuestions.string.medium;

public class LongestPalendromicSubstring {

	public static void main(String[] args) {
		String text = "cbbd";
		longestPalendrome(text);
	}

	private static void longestPalendrome(String text) {
		int maxLength = 1;
		int length = text.length();
		int array[][] = new int[length][length];
		String longestSubString = "";
		for(int index = 0; index<length; index++){
			array[index][index] = 1;
			longestSubString = String.valueOf(text.charAt(0));
		}
		for(int index = 0; index<length-1; index++){
			int value = isPalendrome(text.charAt(index),text.charAt(index+1));
			if(value == 1){
				array[index][index+1] = 1;
				maxLength = 2;
				longestSubString = text.substring(index,index+2);
			}
		}
		
		for(int lengthOfString=3; lengthOfString<= length;lengthOfString++){
			for(int i = 0; i<(length-lengthOfString+1); i++){
				int j = i+lengthOfString-1;
				if((isPalendrome(text.charAt(i),text.charAt(j))==1) && (array[i+1][j-1] == 1)){
					array[i][j] = 1;
					if(lengthOfString>maxLength){
						maxLength = lengthOfString;
						longestSubString = text.substring(i,j+1);
					}
				}
			}
		}
		System.out.println("Longest Substring is: "+longestSubString);
	}

	private static int isPalendrome(char first,char second) {
		return (first==second)?1:0;
	}

}
