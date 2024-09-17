/*
 * @lc app=leetcode id=2220 lang=java
 *
 * [2220] Minimum Bit Flips to Convert Number
 */

// @lc code=start
class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start ^ goal;
        int count = 0;
        System.out.println(n);
        if (n < 0) {
            n = n * -1;
            
        }
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;

    }
}
// @lc code=end
