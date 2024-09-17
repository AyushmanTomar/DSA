/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
import java.util.*;

class Solution {
    // optimal solution
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, n2 = nums2.length;
        int[] res = new int[n];

        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i : nums2) {
            while(!stack.isEmpty() && stack.peek() < i) {
                map.put(stack.pop(), i);
            } 
            stack.push(i);
        }

        for(int i=0; i<n; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        return res;

    // brute force
    // public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    // int ans [] = new int[nums1.length];int k=0;
    // for(int i:nums1)
    // {
    // int flag=0;
    // int max =-1;
    // for(int j:nums2)
    // {
    // if(j==i)
    // flag=1;
    // if(flag==1 && j>i)
    // {
    // max =j;
    // break;
    // }
    // }
    // ans[k++]=max;
    // }
    // return ans;
    // }
}
}
// @lc code=end
