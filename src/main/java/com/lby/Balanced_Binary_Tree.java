package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *   Definition for a binary tree node.
 *
 *   public class TreeNode {
 *
 *        int val;
 *
 *        TreeNode left;
 *
 *        TreeNode right;
 *
 *        TreeNode(int x) { val = x; }
 *
 *        }
 *
 */

class Ret{

        boolean ib = false;

        int height = 0;

        Ret(boolean ib,int height){

                this.ib = ib;

                this.height = height;

        }

}

public class Solution {

        public boolean isBalanced(TreeNode root) {

                Ret ret = isBalanced1(root);

                return ret.ib;

        }

        public Ret isBalanced1(TreeNode node){

                if(node == null)return new Ret(true,0);

                Ret rr = isBalanced1(node.right);

                if(rr.ib == false) return rr;

                Ret lr = isBalanced1(node.left);

                if(lr.ib == false) return lr;

                if(Math.abs(rr.height-lr.height)>1)return new Ret(false,0);

                return new Ret(true,Math.max(rr.height,lr.height)+1);

        }

}
