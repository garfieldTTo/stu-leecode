package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/8
 * @time 上午9:18
 **/
public class Q7_ReverseInt {
    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println(new Solution7().reverse(x));

    }

}


class Solution7 {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int tmp = x % 10;
            x = x / 10;
            if(ans < Integer.MIN_VALUE/10|| (ans == Integer.MIN_VALUE/10 && tmp < -8)) return 0;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && tmp > 7)) {
                return 0;
            }
            ans = ans * 10 + tmp;
        }
        return ans;
    }
}