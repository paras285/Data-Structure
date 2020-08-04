package com.leetcode.tree.traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InOrder {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(10);
		TreeNode node1 = new TreeNode(20);
		TreeNode node2 = new TreeNode(30);
		node.left = node1;
		node.right= node2;
		TreeNode node3 = new TreeNode(40);
		TreeNode node4 = new TreeNode(50);
		TreeNode node5 = new TreeNode(60);
		TreeNode node6 = new TreeNode(70);
		node1.left=node3;
		node1.right=node4;
		node2.left=node5;
		node2.right=node6;
		inOrder(node);
	
	}

	private static void inOrder(TreeNode node) {
		List<Integer> list = new LinkedList();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(node);
		while(!stack.empty()){
			while(node.left!=null){
				stack.push(node);
			}
			TreeNode current = stack.pop();
			list.add(current.val);
			stack.push(current.right);
		}
		System.out.println(list);
	}

}
