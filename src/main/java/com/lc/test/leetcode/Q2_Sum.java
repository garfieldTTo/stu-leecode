package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/6
 * @time 下午11:24
 **/
public class Q2_Sum {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(4);

        ListNode listNode = new Solution().addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode tmp = result;

        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int sum = a + b + carry;
            carry = sum /10;
            tmp.next = new ListNode(carry > 0 ? sum - 10 : sum);

            tmp = tmp.next;
            l1 = l1 != null?l1.next:l1;
            l2 = l2 != null?l2.next:l2;
        }
        if (carry > 0) {
            tmp.next = new ListNode(carry);
        }
        return result.next;
    }



}