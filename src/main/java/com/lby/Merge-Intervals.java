package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *   Definition for an interval.
 *
 *   public class Interval {
 *
 *       int start;
 *
 *       int end;
 *
 *       Interval() { start = 0; end = 0; }
 *
 *       Interval(int s, int e) { start = s; end = e; }
 *
 *       }
 *
 **/

public class Solution {

        public List<Interval> merge(List<Interval> intervals) {
                if(intervals.size() == 0 || intervals.size() == 1)return intervals;
                Collections.sort(intervals,new Comparator<Interval>() {
                        @Override
                        public int compare(Interval o1, Interval o2) {
                                if(o1.start > o2.start) return 1;
                                else if(o1.start < o2.start) return -1;
                                else return 0;
                        }
                });
                List<Interval> ret = new ArrayList<Interval>();
                int index =0;
                ret.add(intervals.get(0));
                for(int i=1;i<intervals.size();i++){
                        Interval x = ret.get(index),y = intervals.get(i);
                        if(y.start <= x.end){
                                x.start = Math.min(x.start,y.start);
                                x.end = Math.max(x.end,y.end);
                        }else{
                                ret.add(intervals.get(i));
                                index ++;
                        }
                }
                return ret;

        }

}
