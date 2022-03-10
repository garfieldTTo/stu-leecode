package com.lc.test.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author fj
 * @description
 * @date 2018/11/11
 * @time 下午1:51
 **/
public class Q20_IsValidKuoHao {
    public static void main(String[] args) {

        String a = "())";
        System.out.println(new Solution20().isValid(a));
    }
}


class Solution20 {

    Map<Character, Character> map = new HashMap<>();
    {
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.keySet().contains(s.charAt(i))) {
                if (stack.empty()) {
                    return false;
                }
                Character tmp = stack.pop();
                if (!map.get(s.charAt(i)).equals(tmp)) {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.size() == 0) {

            return true;
        } else {
            return false;
        }
    }

}