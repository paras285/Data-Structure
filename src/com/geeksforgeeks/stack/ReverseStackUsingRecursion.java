package com.geeksforgeeks.stack;
//To-Do Not Complete
import java.util.Stack;

public class ReverseStackUsingRecursion {
	public static void main(String args[]){
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println(stack.peek());
		reverseStack(stack);
		System.out.println(stack.peek());
	}

	private static void reverseStack(Stack<Integer> stack) {
		if(stack.empty()){
			return;
		}
		int value = stack.peek();
		stack.pop();
		reverseStack(stack);
		stack.push(value);
	}
}
