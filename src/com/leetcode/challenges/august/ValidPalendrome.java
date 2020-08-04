package com.leetcode.challenges.august;

public class ValidPalendrome {
	public static void main(String[] args) {
		String text = "11.,";
		System.out.println(validPalendrome(text));
	}

	private static boolean validPalendrome(String text) {
		if (text.length() == 0 || text.length() == 1) {
			return true;
		}
		int startIndex = 0, endIndex = text.length() - 1;
		while (startIndex <= endIndex) {
			while (!Character.isLetterOrDigit(text.charAt(startIndex)) && startIndex < endIndex) {
				startIndex++;
			}
			while (!Character.isLetterOrDigit(text.charAt(endIndex)) && startIndex < endIndex) {
				endIndex--;
			}
			
			if(Character.isDigit(text.charAt(startIndex)) || Character.isDigit(text.charAt(endIndex))){
				if(text.charAt(startIndex)!=text.charAt(endIndex)){
					return false;
				}
			}else{
				if(Character.toLowerCase(text.charAt(startIndex)) != Character.toLowerCase(text.charAt(endIndex))){
					return false;
				}
			}
			startIndex++;
			endIndex--;
		}
		if(endIndex == text.length()-1){
			return false;
		}
		return true;
	}

	/*private static boolean isAlphaNumeric(char character) {
		if ((character >= 48 && character <= 57) || (character >= 97 && character >= 97)
				|| (character >= 65 && character >= 90)) {
			return true;
		} else {
			return false;
		}
	}*/
}
