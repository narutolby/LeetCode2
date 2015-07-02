package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

        public void rotate(int[] nums, int k) {
               int len = nums.length; 
               k = k % len;
               int l = 0;
               int r = len - k - 1;
               int l1 = len - k;
               int r1 = len - 1;
               rotate(nums,l,r);
               rotate(nums,l1,r1);
               rotate(nums,0,len-1);


        }

        private void rotate(int[]nums,int l,int r){
                while(l<r){
                        int tmp = nums[l];
                        nums[l] = nums[r];
                        nums[r] = tmp;
                        l++;
                        r--
                }
        }

}
