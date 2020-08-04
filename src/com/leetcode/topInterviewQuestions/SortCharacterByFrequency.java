package com.leetcode.topInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class SortCharacterByFrequency {

	public static void main(String[] args) {
		String s = "";
		sortByFrequency(s);
	}

	private static void sortByFrequency(String text) {
		Map<Character,Integer> map = new HashMap<>();
		for(int index = 0; index<text.length(); index++){
			char ch = text.charAt(index);
			if(map.get(ch) != null){
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		int array[] = new int[53];
		for(int index:map.keySet()){
			if(array[index-1] != 0){
				array[index-1] = array[index-1]+1;
			}else{
				array[index-1] = 1;
			}
		}
		
	}

}
