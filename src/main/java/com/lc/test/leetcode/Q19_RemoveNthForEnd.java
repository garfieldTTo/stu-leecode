package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/10
 * @time 下午11:21
 **/
public class Q19_RemoveNthForEnd {
    public static void main(String[] args) {
        ListNode19 l = new ListNode19(1);
        l.next = new ListNode19(2);
        l.next.next = new ListNode19(3);
        l.next.next.next = new ListNode19(4);

        new Solution19().removeNthFromEnd(l, 2);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

}


   class ListNode19 {
      int val;
      ListNode19 next;
      ListNode19(int x) { val = x; }
  }

class Solution19 {
    public ListNode19 removeNthFromEnd(ListNode19 head, int n) {
        ListNode19 a = head;
        ListNode19 b = head;
        int i = 0;
        while(a.next != null){
            a= a.next;

            if(i == n ){
                b = b.next;
            }else {
                i++;
            }
        }

        b.next = b.next.next;
        return head;

    }
}
