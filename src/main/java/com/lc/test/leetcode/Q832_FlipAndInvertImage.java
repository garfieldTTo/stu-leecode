package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/17
 * @time 下午10:58
 **/
public class Q832_FlipAndInvertImage {
}

class Solution832{
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0;i<A.length;i++){
            A[i] = flipRow(A[i]);
        }
        return A;
    }

    private int[] flipRow(int[] a){
        int [] b = new int[a.length];
        for(int i = 0; i < a.length; i ++ ){
            b[b.length -i-1] = a[i];
            b[b.length -i-1] = b[b.length-i] ^ 1;
        }
        return b;
    }

}