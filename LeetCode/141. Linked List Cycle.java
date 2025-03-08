/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */



public class Solution {
    public boolean hasCycle(ListNode head) {        
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if( fast == slow ) return true;
        }

        return false;
    }
}



public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visit = new HashSet<>();
        
        // slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast !=null)
        {
            if(visit.contains(fast))
            {
                flag = true;
                break;
            }
            visit.add(fast);
            fast = fast.next;
        }

        if(flag)
        return true;

        return false;
    }
}
