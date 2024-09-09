/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null)
        {
            return head;
        }
        int n=0;
        ListNode temp = head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        temp = head;
        ListNode prev = null;
        k=k%n;
        while (k > 0) {
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            temp.next = head;
            prev.next = null;
            head = temp;
            k--;
        }
    return head;
    }
}
// @lc code=end
