package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
        public int majorityElement(int[] nums) {
                if(nums.length == 1) return nums[0];
                int max = nums[0],count = 1;
                for(int i=1;i<nums.length;i++){
                        if(count == 0) {max = nums[i];count++;}
                        else if(max == nums[i]) count++;
                        else if(max != nums[i]) count--;
                }
                return max;
        }

}
