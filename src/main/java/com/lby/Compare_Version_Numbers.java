package com.lby;

import java.util.*;

public class Compare_Version_Numbers {

        public int compareVersion(String version1, String version2) {
                String[]str1 = version1.split("\\.");
                String[]str2 = version2.split("\\.");
                int i = 0;
                for(i=0;i<str1.length && i<str2.length;i++){
                        int v1 = Integer.valueOf(str1[i]);
                        int v2 = Integer.valueOf(str2[i]);
                        if(v1<v2)return -1;
                        else if(v1 > v2) return 1;

                } 
                for(;i<str1.length;i++){
                        int v1 = Integer.valueOf(str1[i]);
                        if(v1 != 0) return 1;
                }
                for(;i<str2.length;i++){
                        int v2 = Integer.valueOf(str2[i]);
                        if(v2 != 0) return -1;
                }
                return 0;
        }
}
