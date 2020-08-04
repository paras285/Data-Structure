package com.leetcode.challenges.may;
/*
 * Not-Working
 * 
 */
import java.util.Stack;

public class RemoveKDigits {
	public static void main(String[] args) {
//		String num = "100";
//		removeKdigits(num,1);
		String num = "12";
		System.out.println(removeKdigits(num,3));;
	}

	private static String removeKdigits(String num, int k) {
		if(num.length() == k){
			return "0";
		}
		Stack<Character> stack = new Stack<>();
		for(int index =0 ; index<num.length(); index++){
			char ch = num.charAt(index);
			while(!stack.empty() && stack.peek()>ch && k>0){
				stack.pop();
				k--;
			}
			if((k == 0 && !stack.empty() && ch=='0') ||
					ch != '0'){
				stack.push(ch);
			}
		}
		while(k!=0 && !stack.empty()){
			stack.pop();
			k--;
		}
		if(stack.empty()){
			return "0";
		}
		StringBuffer buffer = new StringBuffer();
		while(!stack.empty()){
			buffer = buffer.append(stack.pop());
		}
		return buffer.reverse().toString();
	}

	/*private static String removeKdigits(String num, int k) {
		if(num.length() == k){
			return "0";
		}
		Stack<Character> stack = new Stack();
		stack.push(num.charAt(0));
		
		for(int index  = 1; index<num.length(); index++){
			char ch = num.charAt(index);
			while(!stack.isEmpty() && stack.peek() > ch && k>0){
				stack.pop();
				k--;
			}
			if(ch != '0' || !stack.isEmpty() && ch == '0'){
				stack.push(ch);
			}
		}
		if(stack.isEmpty() &&  num.charAt(num.length()-1) == '0'){
			stack.push('0');
		}
		StringBuilder newString = new StringBuilder();
		while(!stack.isEmpty())
			newString = newString.append(stack.pop());
		System.out.println(newString.reverse());
		return newString.toString();
	}*/
}
