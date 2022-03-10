package com.lc.test.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fj
 * @description
 * @date 2018/11/7
 * @time 上午9:56
 **/
public class Q3_RepeatSubStr {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(new Solution3().lengthOfLongestSubstring(s));
    }
}



    class Solution3 {
        public int lengthOfLongestSubstring(String s) {
            int ans = 0;
            Set<Character> set = new HashSet<>();
            int i = 0, j = 0;
            int l = s.length();
            if (l <= 1) {
                return l;
            }
            while (i < l && j < l) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                } else {
                    set.remove(s.charAt(i));
                    i ++;
                }
            }
            return ans;
        }
    }

