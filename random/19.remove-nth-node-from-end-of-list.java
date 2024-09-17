/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(n!=0)
        {
            fast = fast.next;
            n--;
        }
        while(fast!=null)
        {
            fast= fast.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev==null)
        {
            head = head.next;
        }
        else if(slow.next==null)
        {
            prev.next = null;
        }
        else
        {
            prev.next = slow.next;
        }
        return head;
    }
}
// @lc code=end

