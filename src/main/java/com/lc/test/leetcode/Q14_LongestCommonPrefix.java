package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/10
 * @time 下午10:10
 **/
public class Q14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] a = {"a"};
        System.out.println(new Solution14().longestCommonPrefix(a));
    }
}

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String a = "";
        int i = 0;
        boolean flag = true;
        while (flag){
            if (strs[0].length() == i) {
                return a;
            }
            char tmp  = strs[0].charAt(i);
            for(String str:strs){
                if (str.length() == i) {
                    return a;
                }
                if(str.charAt(i) == tmp){
                    continue;
                }else{
                    return a;
                }
            }
            i++;
            a = a + tmp;
        }
        return a;
    }
}