/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;



        // ListNode temp1=l1;
        // ListNode temp2=l2;
        // int n1=0;int n2=0;
        // int i=0;
        // while(temp1!=null)
        // {
        //     n1 = temp1.val*((int)Math.pow(10,i++))+n1;
        //     temp1=temp1.next;
        // }
        // i=0;
        // while(temp2!=null)
        // {
        //     n2 = n2+temp2.val*((int)Math.pow(10,i++));
        //     temp2=temp2.next;
        // }
        // int sum = n1+n2;
        // ListNode head = new ListNode(sum%10,null);
        // ListNode prev = head;
        // sum=sum/10;
        // while(sum!=0)
        // {
        //     int d = sum%10;
        //     ListNode node = new ListNode(d,null);
        //     prev.next = node;
        //     prev=prev.next;
        //     sum=sum/10;
        // }
        // return head;
    }
}
// @lc code=end

