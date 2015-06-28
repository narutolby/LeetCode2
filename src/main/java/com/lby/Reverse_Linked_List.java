package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Reverse a singly linked list.
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 *   Definition for singly-linked list.
 *
 *    public class ListNode {
 *
 *         int val;
 *
 *         ListNode next;
 *
 *         ListNode(int x) { val = x; }
 *
 *        }
 *
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */

public class Solution {

        public ListNode reverseList(ListNode head) {

        }
        public ListNode iterative_method(ListNode head){
                if(head == null || head.next == null) return head;
                ListNode tail = null;
                while(head.next != null){
                        ListNode tmp = tail;
                        tail = head;
                        head = head.next;
                        tail.next = tmp;
                }
                head.next =tail;
                tail = head;
                return tail;
        }
        public ListNode recursive_method(ListNode head){
                if(head == null || head.next == null)return head;
                ListNode tail = head.next;
                ListNode tmp = recursive_method(head.next);
                tail.next = head;
                return tmp;
        }

}
