package com.lby;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */

public class Solution{
        public boolean containsDuplicate(int[] nums) {
                Set<Integer> set = new HashSet<Integer>();
                for(int i=0;i<nums.length;i++){
                        if(set.contains(nums[i])){
                                return true;
                        }else{
                                set.add(nums[i]);
                        }
                }
                return false;
        }

public boolean containsDuplicate(int[] nums) {
                if(nums.length == 0) return false;
                quickSort(nums,0,nums.length-1);
                for(int i=0;i<nums.length-1;i++){
                        if(nums[i] == nums[i+1]){
                                return true;
                        }
                }
                return false;
        }


        private void quickSort(int[]nums,int l,int r){
                if(l<r){
                        int q = partition(nums,l,r) ;
                        quickSort(nums,l,q-1);
                        quickSort(nums,q+1,r);
                }
        }
        private void partition(int[]nums,int l,int r){
                int key = nums[r];
                int i = l - 1;
                for(int j=l;j<=r-1;j++){
                        if(nums[j]<=key) {
                                int tmp = nums[i];
                                nums[i] = nums[j];
                                nums[j] = tmp;
                        }
                }
                int tmp = nums[i+1];
                nums[i+1] = nums[r];
                nums[r] = tmp;
                return i+1;
        }
}
