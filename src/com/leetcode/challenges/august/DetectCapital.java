package com.leetcode.challenges.august;

public class DetectCapital {
	public static void main(String[] args) {
		String word = "USA";
		System.out.println(detectCapital(word));
	}

	private static boolean detectCapital(String word) {
		char wordArray[] = word.toCharArray();
		boolean isFirstCapital = true, isSecondCapital = true;
		if(wordArray.length == 1){
			return true;
		}
		char ch = wordArray[0];
		isFirstCapital = isCapital(ch);

		ch = wordArray[1];
		isSecondCapital = isCapital(ch);
		if(word.length()==2 && ((isFirstCapital && isSecondCapital) || (!isFirstCapital && !isSecondCapital)
				|| (isFirstCapital && !isSecondCapital))){
			return true;
		}else if(word.length() == 2 || (!isFirstCapital && isSecondCapital)){
			return false;
		}
		
		for(int index = 2; index<wordArray.length; index++){
			boolean isCapital = isCapital(wordArray[index]);
			if(isSecondCapital != isCapital){
				return false;
			}
		}
		return true;
	}

	private static boolean isCapital(char ch) {
		if (ch >= 65 && ch <= 90) {
			return true;
		} else {
			return false;
		}
	}
}
