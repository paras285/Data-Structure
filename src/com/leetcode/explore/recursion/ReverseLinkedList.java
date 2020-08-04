package com.leetcode.explore.recursion;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode head  = new ListNode(10);
		head.next = new ListNode(20);
		head.next.next = new ListNode(30);
		reverseList(head);
	}

	private static ListNode reverseList(ListNode head) {
		 if (head == null || head.next == null) return head;
		    ListNode p = reverseList(head.next);
		    head.next.next = head;
		    head.next = null;
		    return p;
	}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(){};
	ListNode(int val){
		this.val = val;
	}
	ListNode(int val,ListNode next){
		this.val = val;
		this.next = next;
	}
}
