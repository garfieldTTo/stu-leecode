package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/10
 * @time 下午6:51
 **/
public class Q4_FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1,2};

        System.out.println(new Solution4().findMedianSortedArrays(a, b));
    }

}


class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 1) {
            return nums2[0];
        }
        if (nums1.length == 1 && nums2.length == 0) {
            return nums1[0];
        }
        int count = 0;
        int i = 0, j = 0;
        double a = 0, b = 0;
        while (i < nums1.length || j < nums2.length) {
            if (count == (nums1.length + nums2.length) / 2) {
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return (a + b) / 2;
                } else {
                    return b;
                }
            }
            if (nums1.length == 0 && nums2.length == 0) {
                return 0;
            } else if (nums1.length == 0 && nums2.length == 1) {
                return nums2[j];
            } else if (nums2.length == 0 && nums1.length == 1) {
                return nums1[i];
            } else if (nums1.length == 0) {
                a = nums2[j];
                b = nums2[j + 1];
                j++;
                count++;
                continue;

            } else if (nums2.length == 0) {
                a = nums1[i];
                b = nums1[i+ 1];
                i++;
                count++;
                continue;
            }
            if (nums1[i] < nums2[j]) {
                if (i == nums1.length - 1) {
                    a = nums1[i];
                    b = nums2[j];
                    j++;
                } else {
                    a = nums1[i];
                    b = Math.min(nums1[i + 1], nums2[j]);
                    i++;
                }
            } else {
                if (j == nums2.length - 1) {
                    a = nums2[j];
                    b = nums1[i];
                    i++;
                } else {
                    a = nums2[j];
                    b = Math.min(nums2[j + 1], nums1[i]);
                    j++;
                }
            }
            count++;
        }
        return 0;

    }
}