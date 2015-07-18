package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 * Given a singly linked list, determine if it is a palindrome.
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 * Definition for singly-linked list.
 *
 *   public class ListNode {
 *
 *        int val;
 *
 *        ListNode next;
 *
 *        ListNode(int x) { val = x; }
 *
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */
public class Palindrome Linked List {

        public boolean isPalindrome(ListNode head) {

                if (head == null || head.next == null) return true;

                ListNode h = new ListNode(-1);

                h.next = head;

                ListNode p1 = h, p2 = h;

                while (p1.next != null) {

                        p1 = p1.next;

                        if (p2.next != null) {

                                p2 = p2.next.next;

                        }

                        if (p2 == null || p2.next == null) {

                                break;

                        }

                }

                p2 = p1.next;

                p1.next = null;

                ListNode th = new ListNode(-1);

                th.next = p2;

                p2 = null;

                while (th.next != null) {

                        ListNode tmp = th.next;

                        th.next = th.next.next;

                        tmp.next = p2;

                        p2 = tmp;

                }

                p1 = head;

                while (p1 != null && p2 != null && p1.val == p2.val) {

                        p1 = p1.next;

                        p2 = p2.next;

                }

                if (p1 == null && p2 == null || p1 == null && p2.next == null || p2 == null && p1.next == null) {

                        return true;

                }

                return false;

        }
}
