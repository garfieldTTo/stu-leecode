package com.lc.test.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author fj
 * @description
 * @date 2018/11/8
 * @time 下午10:03
 **/
public class Q15_ThreeSumZero {
    public static void main(String[] args) {

    }
}

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> lessZero = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();
        List<Integer> greateZero = new ArrayList<>();

        for (Integer i : nums) {
            if (i < 0) {
                lessZero.add(i);
            } else if (i > 0) {
                greateZero.add(i);
            } else {
                zero.add(i);
            }
        }


        Collections.sort(lessZero);
        Collections.sort(greateZero);

        List<List<Integer>> result = new ArrayList<>();

        int i = lessZero.size() - 1, j = 0;
        while (i > -1 && j < greateZero.size() - 1) {
            if (zero.size() > 0) {
                int a = lessZero.get(i) + greateZero.get(j);
                if (a == 0) {
                    result.add(Arrays.asList(lessZero.get(i), zero.get(0), greateZero.get(j)));
                } else if (a > 0) {

                }

            }
        }
        return null;
    }
}
