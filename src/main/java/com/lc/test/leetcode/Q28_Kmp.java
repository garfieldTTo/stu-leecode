package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2019/2/22
 * @time 下午9:00
 **/
public class Q28_Kmp {
    public int getNeedle(String s,String t) {
        return getIndex(s.toCharArray(), t.toCharArray());
    }

    public int[] getNext(char[] t){
        int[] next = new int[t.length];
        next[0] = -1;
        next[1] = 0;
        int k = 0;
        for (int i = 2; i < t.length; i++) {
            k = next[i - 1];
            while (k != -1) {

                if (t[k] == t[i - 1]) {
                    next[i] = k + 1;
                    break;
                } else {
                    k = next[k];
                }
                next[i] = 0;
            }
        }

        return next;
    }

    public int getIndex(char[] s, char[] t) {
        int next[] = getNext(t);
        int i = 0;
        int j = 0;
        while (i < s.length && j < t.length) {
            if (j==-1||s[i] == t[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == t.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String a = "aaaaa";
        String b = "aaa";
        System.out.println(new Q28_Kmp().getNeedle(a, b));
    }
}
