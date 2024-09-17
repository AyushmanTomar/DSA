/*
 * @lc app=leetcode id=907 lang=java
 *
 * [907] Sum of Subarray Minimums
 */

// @lc code=start
class Solution {
    int next_minimum(int [] arr,int index)
    {
        int min = arr[index];
        for(int i=index+1;i<arr.length;i++)
        {
            if(min>=arr[i])
            {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(arr.length);
        return arr.length;
    }
    int prev_minimum(int [] arr,int index)
    {
        int min = arr[index];
        for(int i=index-1;i>=0;i--)
        {
            if(min>arr[i])
            {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
    public int sumSubarrayMins(int[] arr) {
        //optimal approach is to make count the contribution of 
        //each element of array in forming the subsets 
        //reverse approach 
        int next_smallest = 0;
        int prev_smallest = 0;
        double sum =0;
        double d = Math.pow(10,9)+7;
        for(int i=0;i<arr.length;i++)
        {
            next_smallest=next_minimum(arr, i);
            prev_smallest=prev_minimum(arr, i);
            sum+=(((next_smallest-i))*(i-prev_smallest))*arr[i];
            System.out.println(sum);
        }
        return (int)(sum%d);











        //subarrays brute force approach
        // int min =0;double sum =0;double d =Math.pow(10, 9)+7;
        // for(int i=0;i<arr.length;i++)
        // {
        //     min = arr[i];
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         min = Math.min(arr[j], min);
        //         sum = sum+min;
        //     }
        // }
        // return (int)(sum%d);
    }
}
// @lc code=end

 