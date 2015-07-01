package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution{
        public int hammingWeight(int n) {
                int ret = 0;
                while(n!=0){
                        n = n & n-1;
                        ret ++ ;
                }
                return ret;
        }
}
