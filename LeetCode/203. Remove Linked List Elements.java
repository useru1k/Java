/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
        return head;

        while(head != null && head.val == val)
        {
            head = head.next;
        }
        // ListNode dump = new ListNode(0); // Create for pointing head
        // dump.next = head;
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null)
        {
            if(temp.val == val)
            {
                prev.next = temp.next;
            }
            else
            {
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
        
        // Why i am facing this is error means if first element is change and head will change so i use dump variable
        // while(temp.next != null)
        // {
        //     prev = temp;
        //     temp = temp.next;
        // }
        // prev.next = null;

        // temp = head;
        // prev = null;
        // while(temp.val != val)
        // {
        //     prev = temp;
        //     temp = temp.next;
        // }

        // prev.next = temp;
    }
}
