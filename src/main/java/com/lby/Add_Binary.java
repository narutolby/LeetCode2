package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Solution {

        public String addBinary(String a, String b) {

                if(a == null || a.length()==0)return b;

                if(b == null || b.length()==0) return a;

                int i = a.length()-1,j = b.length()-1;

                int carry = 0;

                int t = Math.max(i,j) + 1;

                int len = t;

                int[]ret = new int[len+1];

                while(i >= 0 && j >= 0){

                        ret[t--] = (toInt(a.charAt(i)) + toInt(b.charAt(j)) + carry)%2;

                        carry = (toInt(a.charAt(i)) + toInt(b.charAt(j)) + carry)/2;

                        i--;

                        j--;

                }

                while(i >= 0){

                        ret[t--] = (toInt(a.charAt(i)) + carry)%2;

                        carry = (toInt(a.charAt(i)) + carry)/2;

                        i--;

                }

                i = j;

                while(i >= 0){

                        ret[t--] = (toInt(b.charAt(i)) + carry)%2;

                        carry = (toInt(b.charAt(i)) + carry)/2;

                        i--;

                }

                if(carry > 0) ret[t] = carry;

                else t++;

                StringBuilder sb = new StringBuilder();

                while(t<=len){

                        sb.append(String.valueOf(ret[t]));

                        t++;

                }

                return sb.toString();

        }



        private int toInt(char c){

                return Integer.valueOf(String.valueOf(c));

        }

}
