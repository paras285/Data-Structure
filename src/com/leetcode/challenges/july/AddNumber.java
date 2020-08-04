package com.leetcode.challenges.july;

public class AddNumber {
	public static void main(String[] args) {
		int number = 0;
		new AddNumber().addNumber(number);
		new AddNumber().addNumberWithoutLoop(number);
	}

	private void addNumberWithoutLoop(int number) {
		System.out.println((number<9)?number:((number%9) == 0)?9:number%9);		
	}

	private void addNumber(int number) {
		int sum = 0;
		while(number!=0){
			int tempNumber = number%10;
			sum = sum+tempNumber;
			number = number/10;
			if(number==0){
				number = sum;
				if(sum<=9){
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
