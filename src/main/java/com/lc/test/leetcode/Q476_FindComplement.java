package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/21
 * @time 下午9:09
 **/
public class Q476_FindComplement {
    public static void main(String[] args) {
        System.out.println(new Solution476().findComplement(3));

    }
}


class Solution476 {
    public int findComplement(int num) {
        return num ^ get2Poawer(num);
    }
    public int get2Poawer(int a){
        int n = a -1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n+1;
    }
}