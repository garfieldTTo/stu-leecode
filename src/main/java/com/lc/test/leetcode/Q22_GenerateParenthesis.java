package com.lc.test.leetcode;

import java.util.*;

/**
 * @author fj
 * @description
 * @date 2018/11/11
 * @time 下午2:31
 **/
public class Q22_GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(new Solution22().generateParenthesis(3));
    }
}


class Solution22 {
    public List<String> generateParenthesis(int n) {
        if (n == 1) {
            return Arrays.asList("()");
        }
        if (n == 0) {
            return new ArrayList<>();
        }

        List<String> strings = generateParenthesis(n - 1);
        Set<String> result = new HashSet<>();
        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                StringBuffer sb = new StringBuffer();
                sb.append(s).insert(i, "()");
                result.add(sb.toString());
            }
        }
        return new ArrayList<>(result);
    }

}