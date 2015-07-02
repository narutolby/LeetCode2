package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {
        public int reverseBits(int n) {
                int ret = 0;
                for(int i=0;i<32;i++){
                        ret = ret << 1;
                        ret |=  (n & 1);
                        n = n >> 1;

                }
                return ret;
        }
}
