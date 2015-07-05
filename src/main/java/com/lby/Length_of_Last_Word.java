package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
        public int lengthOfLastWord(String s) {
               if(s == null || s.length() == 0)return 0;
                int ret = 0;
                int ret1 = 0;
                for(int i=0;i<s.length();i++){
                   if(s.charAt(i)==' ') {ret1=(ret != 0?ret:ret1);ret = 0;}
                   else ret ++;
                }
                return ret == 0 ? ret1:ret;
        }
}
