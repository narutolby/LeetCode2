package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * Note:
 * You may assume both s and t have the same length.
 *
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */
public class Solution{
        public boolean isIsomorphic(String s, String t) {
                if(s == t || s.equals(t)) return true;
                int[]a = new int[s.length()];
                char[]ss = s.getChars();
                char[]tt = t.getChars();
                for(int i=0;i<s.length();i++){
                        a[i] = -1;      
                }
                for(int i=0;i<s.length();i++){
                        if(a[convertCharToNum(ss.getChar(i))] == -1){
                             a[convertCharToNum(ss.getChar(i))] = convertCharToNum(tt.getChar(i));
                        }else{
                             if(a[convertCharToNum(ss.getChar(i))] != convertCharToNum(tt.getChar(i))){
                                return false;
                             }
                        }
                }
                return true;
        }

        private int convertCharToNum(char c){
                return c - 'a';
        }

        public int findRoot(int[]a,int i){
                if(i == a[i]) return a[i];
                return (a[i] = findRoot(a,a[i]));
        }

        public void quick_union(int i,int j,int[]a){
                a[i] = findRoot(a,j);
        }
}
