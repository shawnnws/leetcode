package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        System.out.println(list);

        for (int i = 0; i < list.size() / 2; i++) {
            int tailPointer = list.size() - 1 - i;
            if (!(list.get(i) == list.get(tailPointer))) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {

        if (head.next == null) {
            return true;
        }

        //Finding middle of linked list
        int count = 1;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        ListNode tailPointer = head;

//        if (fast == null && head.val != slow.val) {
//            return false;
//        } else if (fast == null) {
//            return true;
//        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count += 1;
        }
        System.out.println(slow.val);
        System.out.println(count);

        //Determine first half tail.
        for (int i = 1; i < count; i++) {
            tailPointer = tailPointer.next;
        }
        System.out.println(tailPointer.val);

        //Reversing second half of linked list
        ListNode middle = slow;
        ListNode prev = null;
        ListNode next = null;
//        ListNode curr = slow;

        while (middle != null) {
            next = middle.next;
            middle.next = prev;
            prev = middle;
            middle = next;
        }
        tailPointer.next = prev;

        for (int i = 0; i < count; i++) {
            if (head.val == prev.val) {
                head = head.next;
                prev = prev.next;
            } else {
                return false;
            }
        }
        return true;
    }
}
