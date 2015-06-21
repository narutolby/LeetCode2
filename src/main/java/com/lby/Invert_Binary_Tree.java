package com.lby;

import java.util.*;

/**
 * Invert a binary tree.
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *      to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */
public class  Invert_Binary_Tree{

	public TreeNode invertTree(TreeNode root) {

		Random rand = new Random(100l);
		if(rand.nextLong() % 3 == 0){
			return recursiveMethod1(root);
		}else if(rand.nextLong() % 3 == 1){
			return recursiveMethod2(root);
		}else {
			return non_recursiveMethod3(root);
		}
	}

	/**
	 * 中序遍历的方式复制反转二叉树，缺点是空间复杂度为O(n)
	 */
	private TreeNode recursiveMethod1(TreeNode root){
		if(root == null) return  root;
		TreeNode r2 = new TreeNode(root.val);
		inOrder(root,r2);
		return r2;
	}
	private void inOrder(TreeNode r1,TreeNode r2){
		if(r1 == null)
			return;
		if(r1.left != null)	{
			r2.right = new TreeNode(r1.left.val);
		}
		if(r1.right != null){
			r2.left = new TreeNode(r1.right.val);
		}
		inOrder(r1.left,r2.right);
		inOrder(r1.right,r2.left);
	}

	/**
	 * 递归调用反转
	 */
	private TreeNode recursiveMethod2(TreeNode root){
		if(root == null) return  root;
		TreeNode left = root.right;
		root.right = recursiveMethod2(root.left);
		root.left = recursiveMethod2(left);
		return root;
	}

	/**
	 * BFS反转
	 */
	private TreeNode non_recursiveMethod3(TreeNode root){
		if(root == null) return root;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			swap(node);
			if(node.left != null)	{
				queue.offer(node.left);
			}
			if(node.right != null)	{
				queue.offer(node.right);
			}
		}
		return root;
	}
	private void swap(TreeNode node){
		TreeNode tmp = node.left;
		node.left = node.right;
		node.right = tmp;
	}


}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
