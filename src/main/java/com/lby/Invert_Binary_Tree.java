package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
		if(root == null) return null;
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
			r2.left= new TreeNode(r1.right.val);
		}
		inOrder(r1.left,r2.right);
		inOrder(r1.right,r2.left);
	}

}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
