package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/8
 * @time 下午9:39
 **/
public class Q11_MaxWater {

    public static void main(String[] args) {
        int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(new Solution11().maxArea(a));

    }


}



class Solution11 {
    public int maxArea(int[] height) {
        int max = 0;


        int i = 0, j = height.length - 1;
        int l = height.length;
        while(i<j){
            max = Math.max(Math.min(height[i], height[j]) * (j - i), max);

            if (height[i] < height[j]) {

                i++;
            } else {

                j--;
            }
        }

        return max;
    }
}
