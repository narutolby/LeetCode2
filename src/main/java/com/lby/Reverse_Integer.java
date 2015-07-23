package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Reverse_Integer{

        public int reverse(int x) {

                boolean p = true;

                if(x<0)p=false;

                x = Math.abs(x);

                long ret = 0l;

                while(x>0){

                        ret = ret * 10 + x%10;

                        x = x / 10;

                }

                if(!p) ret = 0 - ret;

                if(ret>Math.pow(2,31)-1 || ret < -Math.pow(2,31))return 0;

                return (int)ret;

        }





}
