package com.leetcode.tree.traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
public class PreOrder {

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
		preOrder(node);
	}

	private static void preOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		List<Integer> result = new LinkedList<>();
		stack.push(node);
		while(!stack.empty()){
			TreeNode node1 = stack.pop();
			if(node!=null){
				result.add(node1.val);
				if(node1.right!=null){
					stack.push(node1.right);
				}
				if(node1.left!=null){
					stack.push(node1.left);
				}
			}
		}
		System.out.println(result);
	}

}
