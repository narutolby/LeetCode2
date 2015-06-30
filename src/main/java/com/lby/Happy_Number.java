package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */

public class Solution {

        public boolean isHappy(int n) {
                Set<Integer> set = new HashSet<Integer>();
                while(!set.contains(n)){
                        set.add(n);
                        n = calculate(n);
                        if(n == 1){
                                return true;
                        }
                }
                return false;
        }

        private int calculate(int n){
                int sum = 0;    
                while(n != 0){
                        sum += Map.pow(n%10,2);
                        n = n/10;
                }
                return sum;

        }

}
