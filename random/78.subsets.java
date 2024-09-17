/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        int n = nums.length;
        int sC = 1 << n;

        for (int i = 0; i < sC; ++i) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; ++j) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            sets.add(subset);
        }
        return sets;
    }


}

// @lc code=end

