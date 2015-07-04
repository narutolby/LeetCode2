package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MinStack {

        private int top = 0;

        private int len = 256;

        int[]stack = new int[len];

        int[]minStack = new int[len];

        int size = 0;

        public void push(int x) {

                ensureCampacity(size + 1);

                stack[top] = x;

                if(size == 0)minStack[top]=x;

                else minStack[top] = Math.min(x,minStack[top-1]);

                top++;

                size ++;

        }

        public void pop() {

                if(size==0)return;

                size --;

                top--;

        }

        public int top() {

                return stack[top-1];

        }

        public int getMin() {

                return minStack[top-1];

        }

        private void ensureCampacity(int size){

                if(size > len){

                        len = len * 2;

                        stack = Arrays.copyOf(stack,len);

                        minStack = Arrays.copyOf(minStack,len);

                }

        }

}
