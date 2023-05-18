package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        //Create rabbit and tortoise pointer.
        ListNode tortoise = head;
        ListNode rabbit = head;
//        boolean hasCycle = false;

        if (head == null || head.next == null) {
            return false;
        }

        while (tortoise != null && rabbit != null && rabbit.next != null) {
//        while (tortoise.next != null && rabbit.next != null) {
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
//            System.out.println(tortoise.val);
//            System.out.println(rabbit.val);

            if (tortoise == rabbit) {
                return true;
            }
        }
        return false;
    }
}