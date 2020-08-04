package com.geeksforgeeks;

import java.util.Stack;

/*Problem --> Given prices of stock ith day. Find its span
So what is span? Span is for any given index, the price was higher than its previous adjancent days
		For example: Given an array --> {100,80,60,70,60,75,85}. By default span will include itself as 1. So the minimum span for any given day is 1
So, for 0th Day --> Span is 1 by default
1st Day --> Span is 1 as value at its previous day i.e 0th day is 100 that is greater than 80. Hence Span is 1
2nd Day --> Span is 1 as value at its previous day i.e 1st day is 80 that is greater than 60. Hence Span is 1
3rd Day --> Span is 2 as it is greater than its one previous day i.e greater than 2nd day. Hence Span is 2
4th Day --> Span is 1 as price at its previous day i.e 3 day is greater than current day price
5th Day --> Span is 4 as it is greater than its previous adjacent days i.e. price[5] > price[4] && price[3] && price[2]. 
	So 1 (its own day) + previous 3 days. Hence 4
6th Day --> Span is 6 as it is greater than its previous adjacent days. price[6] > price[4] && price[3] && price[2] && price[1]

Solution: This problem can be solved in 2 ways

Solution1 --> Brute Force Approach
For any given day, compare its previous value and increment the count. If at any given day , that value is greater than current index break it

Solution2--> Efficient Solution using Stack [Stack will contain the prices at decreasing order]
By Default, we are pushing the first value of array in stack, and corresponding to it span[0] will have 1 as we should include that day
We will iterate over the rest of array
We will check if stack is non-empty AND price[index]>=price[stack.top]
If GREATER, then we will keep poping the top of stack till we find stack top value which is greater than current price[index]
Once this is done, we will check if stack is empty then that means this is largest element by now, then span[index] will be index+1
If SMALLER, then it will be, index - stack.top() because stack.pop() contains the largest element till now.
*/
public class StockSpan {
	public static void main(String... args){
		int array[] = new int[]{100,80,60,70,60,75,85};
		findStockSpanUsingStack(array);
	}

	private static void findStockSpanUsingStack(int[] array) {
		int spanArray[] = new int[array.length];
		Stack<Integer> stack = new Stack<>();
		for(int index = 0; index<array.length; index++){
			while(!stack.empty() && array[index] >= stack.peek() ){
				stack.pop();
			}
			if(stack.empty()){
				spanArray[index] = index+1;
			}else{
				spanArray[index] = index - (stack.pop());
			}
			stack.push(index);
	}	
		for(int index:spanArray){
			System.out.println(index);
		}
		
	}

}
