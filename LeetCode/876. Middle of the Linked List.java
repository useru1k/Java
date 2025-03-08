class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // if(fast.next.next == null)
        // {
        //     fast = fast.next;
        //     return fast;
        // }
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        // System.out.println(slow.val);
        return slow;
    }
}
