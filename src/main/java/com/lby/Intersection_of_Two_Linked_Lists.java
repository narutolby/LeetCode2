
p

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */

/**
 *
 *   Definition for singly-linked list.
 *
 *   public class ListNode {
 *
 *        int val;
 *
 *        ListNode next;
 *
 *        ListNode(int x) {
 *
 *         val = x;
 *
 *         next = null;
 *
 *        }
 *
 *    }
 *
 **/

public class Solution {

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

                if(headA == null || headB == null) return null;

                ListNode p1 = headA;

                ListNode p2 = headB;

                while(p1.next != null){

                        p1 = p1.next;

                }

                while(p2.next != null){

                        p2 = p2.next;

                }

                if(p1 != p2){

                        return null;

                }

                p1.next = headB;

                ListNode one = headA.next,two = headA.next.next;

                while(one != two){

                        one = one.next;

                        two = two.next.next;

                }

                one = headA;

                while(one != two){

                        one = one.next;

                        two = two.next;

                }

                p1.next = null;

                return one;

        }

}
