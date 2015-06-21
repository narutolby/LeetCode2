package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */
public class Two_Sum {
	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2){
			throw new IllegalArgumentException();
		}
		int[] ret = new int[2];
		int l = 0,r = nums.length - 1;
		int[] tmp = null;
		tmp = Arrays.copyOf(nums,nums.length);
		Arrays.sort(nums);
		while(l<r){
			if(nums[l] + nums[r] < target){
				l ++ ;
			}else if(nums[l] + nums[r] > target){
				r --;
			}else{
				ret[0] = nums[l];
				ret[1] = nums[r];
				System.out.println(ret[0] + "," + ret[1]);
				break;
			}
		}
		boolean lb = false,rb = false;
		for(int i =0;i<tmp.length;i++){
			if(tmp[i] == ret[0] && lb == false){
				lb = true;
				ret[0] = i+1;
			}else if(tmp[i] == ret[1] && rb == false){
				rb = true;
				ret[1] = i+1;
			}
		}
		Arrays.sort(ret);
		return ret;
	}
	public int[] twoSum1(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int ret[] = new int[2];
		for(int i=1;i<=nums.length;i++){
			if(map.containsKey(nums[i-1])) {
				ret[0] = map.get(nums[i-1]);
				ret[1] = i;
				break;
			}
			map.put(target-nums[i-1],i);
		}
		return ret;
	}
}
