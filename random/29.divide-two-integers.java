/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {

        // Handle overflow edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1;

        // Work with positive values for simplicity
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        long quotient = 0;

        // Subtract the divisor from the dividend using bitwise shifts
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            long multiple = 1;
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            absDividend -= tempDivisor;
            quotient += multiple;
        }

        // Apply the sign to the result
        return (int) (sign * quotient);

    }

    // if(dividend==divisor)
    // return 1;
    // if (dividend == Integer.MIN_VALUE && divisor == -1) {
    // return Integer.MAX_VALUE;
    // }
    // int sign =1;
    // if((dividend<0&&divisor>0) || (dividend>0&&divisor<0))
    // {
    // sign = -1;
    // }
    // dividend= (int)Math.abs(dividend);
    // divisor=(int) Math.abs(divisor);
    // int i=0;
    // int ans =0;
    // while(dividend>=divisor)
    // {
    // i=0;
    // while(dividend>(divisor<<(i+1)))
    // {
    // i++;
    // }
    // dividend -=(divisor<<i);
    // ans += (1<<i);
    // }

    // return sign*ans;
    // }
}
// @lc code=end
