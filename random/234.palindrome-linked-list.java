/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int left = 0;
        int right = list.size()-1;
        while(left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }
        return left >= right;
        





        // ListNode temp = head;
        // ListNode temp2 = head;
        // String num = "";
        // String rev = "";
        // while(temp!=null)
        // {
        //     num+=Integer.toString(temp.val);
        //     temp = temp.next;
        // }
        // for(int i=num.length()-1;i>=0;i--)
        // {
        //     char ch  = num.charAt(i);
        //     rev = rev+ch ;
        // }
        // if(rev.equalsIgnoreCase(num))
        // return true;
        // else
        // return false;
    }
}
// @lc code=end

