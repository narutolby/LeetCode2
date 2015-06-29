package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example
 * Given: 1 --------------------> 2 --------------------> 6 --------------------> 3 --------------------> 4 --------------------> 5 --------------------> 6, val = 6
 * Return: 1 --------------------> 2 --------------------> 3 --------------------> 4 --------------------> 5
 */

/**
 *
 *    Definition for singly-linked list.
 *
 *    public class ListNode {
 *
 *         int val;
 *
 *         ListNode next;
 *
 *         ListNode(int x) { val = x; }
 *
 *       }
 *
 */

public class Solution {

        public ListNode removeElements(ListNode head, int val) {
                if(head == null) return head;
                ListNode h = new ListNode(0);
                ListNode ret = h;
                h.next = head;
                while(h!=null && h.next != null){
                        ListNode tmp = h;
                        while(tmp != null && tmp.next !=null && tmp.next.val == val)   {
                                tmp = tmp.next;
                        }
                        h.next = tmp.next;
                        h=h.next;
                }
                return ret.next;
        }

}
