package com.lby;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Solution {

        public int[] plusOne(int[] digits) {

                int n = 0;

                int c = 1;

                for(int i=digits.length-1;i>=0;i--){

                        if(i==digits.length-1)c = 1;

                        else c = 0;

                        if(digits[i] + c  + n >= 10){



                                digits[i] = digits[i] + c + n - 10;

                                n = 1;

                        }else{

                                digits[i] = digits[i] + c + n;

                                n = 0;

                        }

                }

                int ret[];

                if(n > 0){

                        ret = new int[digits.length + 1];

                        for(int i=0;i<digits.length;i++){

                                ret[i+1] = digits[i];

                        }

                        ret[0] = n;

                        return ret;

                }else{

                        return digits;

                }

        }

}
