/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
 */

// @lc code=start

import org.w3c.dom.NodeList;

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
    public ListNode sortList(ListNode head) {
        NodeList temp = head;
        NodeList temp1 = head.next;
        //using bubble sort
        while(temp!=null)
        {
            while(temp1!=null)
            {
                if(temp.data>temp1.data)
                {
                    
                    temp.next=temp1.next;
                    temp1.next = temp;
                }
            }
        }
        
        
    }
}
// @lc code=end

