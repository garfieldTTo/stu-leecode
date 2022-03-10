package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2019/2/17
 * @time 下午3:53
 **/
class ListNode1{
    int val;
    ListNode1 next;
    ListNode1 prev;
    public ListNode1(int val){
        this.val = val;
    }
}
public class Q707_MyLinkedList {

    private ListNode1 head;
    private ListNode1 tail;
    private int size = 0;

    /** Initialize your data structure here. */
    public Q707_MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        int i = 0;
        ListNode1 res = head;
        while(i < index-1){
            res = res.next;
        }
        return res.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode1 cur = new ListNode1(val);
        if(head != null){
            cur.next = head;
            head.prev = cur;
        }else{
            tail = cur;
        }
        head = cur;

        size ++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode1 cur = new ListNode1(val);
        if(tail != null){
            cur.prev = tail;
            tail.next = cur;
        }else{
            head = cur;
        }
        tail = cur;
        size ++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size)
        {
            addAtTail(val);
            return;
        }
        ListNode1 cur = new ListNode1(val);
        ListNode1 tmp = head;
        while(index != 0){
            tmp = tmp.next;
            index --;
        }
        cur.next = tmp;
        cur.prev = tmp.prev;
        tmp.prev.next = cur;
        tmp.prev = cur;
        size ++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index > size -1) return;
        if(index == 0){
            if(size == 1) {
                head = null;
                tail = null;
            }else{
                head.next.prev = null;
                head = head.next;
            }
        }else if(index == size-1){
            tail.prev.next = null;
            tail = tail.prev;
        }else{
            ListNode1 tmp = head;
            while(index != 0){
                tmp = tmp.next;
                index --;
            }
            tmp.next.prev = tmp.prev;
            tmp.prev.next = tmp.next;
        }
        size --;
    }

    public static void main(String[] args) {
        Q707_MyLinkedList obj = new Q707_MyLinkedList();

        int param_1 = obj.get(1);
        printList(obj);
        obj.addAtHead(1);
        System.out.println(obj.get(1));

        printList(obj);

//        obj.addAtTail(3);
        printList(obj);

        obj.addAtIndex(1,2);
        printList(obj);


        System.out.println(obj.get(1));
        obj.deleteAtIndex(1);
        System.out.println(obj.get(1));

    }

    public static void printList(Q707_MyLinkedList list) {
        ListNode1 tmp = list.head;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
}


