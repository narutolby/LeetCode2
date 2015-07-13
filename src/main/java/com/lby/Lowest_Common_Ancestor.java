package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 *
 *  * Definition for a binary tree node.
 *
 *    public class TreeNode {
 *
 *         int val;
 *
 *         TreeNode left;
 *
 *         TreeNode right;
 *
 *         TreeNode(int x) { val = x; }
 *
 *        }
 *
 **/

public class Solution {

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

                if(root == null || p == null || q == null) return null;

                if(p.val > q.val){

                        TreeNode tmp = p;

                        p = q;

                        q = tmp;

                }

                if(root.val < p.val){

                        return lowestCommonAncestor(root.right,p,q);

                }else if(root.val > q.val){

                        return lowestCommonAncestor(root.left,p,q);

                }else{

                        return root;

                }

        }



}
