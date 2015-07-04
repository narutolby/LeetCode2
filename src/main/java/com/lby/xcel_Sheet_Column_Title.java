package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
        public String convertToTitle(int n) {
                StringBuffer sb = new StringBuffer();
                int A = 'A';
                while(n > 0){
                        int m = n % 26;
                        if(m == 0)sb.append('Z');
                        else sb.append((char)(A + m - 1));
                        n = n/26;
                        if(m == 0 && n >= 1){
                                n = n -1;
                        }
                }
                return sb.reverse().toString();
        }
}
