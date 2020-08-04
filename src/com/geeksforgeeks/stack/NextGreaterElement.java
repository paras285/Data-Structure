package com.geeksforgeeks.stack;

import java.util.Stack;

/*
 * This algorithm is using stacks and array.
 * Approach --> We will be pushing each element into stack which is smaller than or equal to top of stack
 * If we find any element that is greater than top of stack, that means we have find the
 * next greater element. We will pop it from stack and store current indices to array as that is element
 * Reference --> https://www.youtube.com/watch?v=sDKpIO2HGq0
 */
public class NextGreaterElement {

	public static void main(String[] args) {
		int array[] = new int[]{13,7,6,12,10};
		findNextGreatestElement(array);
	}

	private static void findNextGreatestElement(int[] array) {
		Stack<Integer> stack = new Stack<>();
		int nge[] = new int[array.length];
		stack.push(0);
		for(int index = 1; index<array.length; index++){
			if(array[index]<=array[stack.peek()]){
				stack.push(index);
			}else{
				while(!stack.empty() && array[index]> array[stack.peek()]){
					int i = stack.pop();
					nge[i] = array[index];
				}
				stack.push(index);
			}
			}
		while(!stack.empty()){
			int popIndex = stack.pop();
			nge[popIndex] = -1;
		}
		for(int i = 0; i<array.length; i++){
			System.out.print(nge[i]+" ");
		}
	}

}
