package com.leetcode.challenges.may;

import java.util.HashSet;
import java.util.Set;

/*
 * Leetcode-387
 */
public class FirstUniqueCharacterinString {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}

	private static int firstUniqChar(String s) {
		Set<Character> set = new HashSet<>();
		for(int index=0; index<s.length(); index++){
			char ch = s.charAt(index);
			if(set.contains(ch)){
				return index;
			}else{
				set.add(ch);
			}
		}
		return -1;
	}

}
