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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        if(head == null)
        return null;

        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        hash.add(nums[i]);
        
        // for(int i=0;i<nums.length;i++)
        // {
            // int val = nums[i];

            while(head != null && hash.contains(head.val))
            {
                head = head.next;
            }

            ListNode temp = head;
            ListNode prev = null;

            while(temp != null)
            {
                if(hash.contains(temp.val))
                {
                    prev.next = temp.next;
                }
                else
                {
                    prev = temp;
                }
                temp = temp.next;
            }
        // }
        return head;
    }
}
