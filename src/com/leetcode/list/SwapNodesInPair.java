package com.leetcode.list;

public class SwapNodesInPair {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
//		swapNodes(head);
		Node temp = head;
		swapUsingRecursion(temp);
		temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	private static void swapUsingRecursion(Node temp) {
		if(temp == null || temp.next == null){
			return;
		}
		int data = temp.data;
		temp.data = temp.next.data;
		temp.next.data = data;
		swapUsingRecursion(temp.next.next);
	}

	private static void swapNodes(Node head) {
		Node temp = head;
		while(temp!= null && temp.next != null){
			int tempData = temp.data;
			temp.data = temp.next.data;
			temp.next.data =  tempData;
			temp = temp.next.next;
		}
//		System.out.println(head);
		temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}

