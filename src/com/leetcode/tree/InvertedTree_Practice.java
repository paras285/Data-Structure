package com.leetcode.tree;

public class InvertedTree_Practice {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(2);
		node.right = new TreeNode(7);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(3);
		node.right.left = new TreeNode(6);
		node.right.right = new TreeNode(9);
		invertTree(node);
		System.out.println(node);
	}

	private static TreeNode invertTree(TreeNode node) {
		if(node == null){
			return null;
		}
		TreeNode left = invertTree(node.left);
		TreeNode right = invertTree(node.right);
		
		node.left = right;
		node.right = left;
		return node;
	}

}
