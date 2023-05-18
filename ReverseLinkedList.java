package leetcode;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            //Use next as a pointer to keep track of next node from current node
            next = curr.next;
            //Point current node to prev/null, which makes it the tail
            curr.next = prev;
            //Point prev at current node for next iteration
            prev = curr;
            //Point current node at next node for next iteration
            curr = next;
        }
        return prev;
    }
}
