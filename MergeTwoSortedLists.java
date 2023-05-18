package leetcode;

public class MergeTwoSortedLists {
    public static class ListNode {

        //For linked lists, when we refer to the name of the list, we are referring to the head of the list, which is the
        //first node of the list.

        //Define an int variable for value in each node
        int val;

        //A node attribute to point to the next node / Create a pointer to point to next node.
        ListNode next;

        //For creating a new list
        ListNode() {}

        //For creating a new node with a specific value inside
        ListNode(int val) { this.val = val; }

        //Defining a new node with 2 attributes, the value assigned to it and the next node it will point to
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Creating a new list with a node containing -1 value, acts as pointer to the head node of our new list
        ListNode result = new ListNode(-1);
        //Creating a pointer pointing at last node of result
        ListNode tail = result;

        //Iterate through the lists given they are both not empty
        while (list1 != null && list2 != null) {
            //Compare and add smaller value to list
            if (list1.val <= list2.val) {
                //Add new list tail, set it to be the smaller value node
                tail.next = list1;
                //list1 pointer moves to next value
                list1 = list1.next;
            } else {
                tail.next = list2;
            }
            //Set result tail pointer to be tail.next
            tail = tail.next;
        }

        //Append remainder of one list if the other becomes empty
        if (list1 == null) {
            tail.next = list2;
            //or just return list2 aka just point to remainder of list2
        }
        else if (list2 == null) {
            tail.next = list1;
            //or just return list1 aka just point to remainder of list1
        }
        //Return resultant list skipping the first dummy node created by new ListNode(-1)
        return result.next;
    }
    //Utility function to print out linked list
    //For debugging purposes and illustration
    static void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.val + " ");
            node = node.next;
        }
    }

}
