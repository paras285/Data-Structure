package com.leetcode.topInterviewQuestions;

import java.util.Arrays;
import java.util.Stack;

/*
 * Leetcode-793
 * Logic of this approach is similar to Next Greater Elements
 */
public class DailyTemperatures {

	public static void main(String[] args) {
		int temperature[] = new int[]{10,10,10};
//		73, 74, 75, 71, 69, 72, 76, 73
		System.out.println(Arrays.toString(dailyTemperatures(temperature)));
	}

	private static int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> stack = new Stack<Integer>();
		if(temperatures.length<2){
			return new int[]{0};
		}
		int result[] = new int[temperatures.length];
		stack.push(0);
		for(int index = 1; index<temperatures.length; index++){
			while(!stack.isEmpty() && temperatures[index] > temperatures[stack.peek()]){
				int element = stack.pop();
				result[element] = index-element;
			}
			stack.push(index);
		}
		System.out.println(Arrays.toString(result));
		return result;
	}

}
