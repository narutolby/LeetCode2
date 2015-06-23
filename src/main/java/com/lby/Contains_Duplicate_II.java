package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, find out whether there there are two distinct indices i and j in the array such 
 * that nums[i] = nums[j] and the difference between i and j is at most k.
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */
public class Contains_Duplicate_II{
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums == null || nums.length < 2 )
			return false;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
				return true;
			}else{
				map.put(nums[i],i);
			}
		}
		return false;
	}
}
