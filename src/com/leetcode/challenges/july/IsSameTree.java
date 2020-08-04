package com.leetcode.challenges.july;

public class IsSameTree {
	public static boolean isSame = true;
	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(1);
		tree1.left = new TreeNode(2);
		tree1.right = new TreeNode(3);
		TreeNode tree2 = new TreeNode(1);
		tree2.left = new TreeNode(2);
		tree2.right = new TreeNode(4);
		isSame(tree1, tree2);
	}

	private static void isSame(TreeNode tree1, TreeNode tree2) {
		System.out.println(traverseTree(tree1,tree2));
	}

	private static boolean traverseTree(TreeNode node1, TreeNode node2) {
		return false;
	}
}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int data) {
		this.data = data;
	}

	public TreeNode(int data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

}