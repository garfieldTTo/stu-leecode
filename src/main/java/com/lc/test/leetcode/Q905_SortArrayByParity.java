package com.lc.test.leetcode;

/**
 * @author fj
 * @description
 * @date 2018/11/17
 * @time 下午10:43
 **/
public class Q905_SortArrayByParity {

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(new Solution905().sortArrayByParity(arr));

    }

}


class Solution905 {
    public int[] sortArrayByParity(int[] A) {

        int  i = 0,j = A.length-1;

        while(i<=j){
            while ( i < A.length &&A[i] % 2 == 0 )
                i++;
            while(j >= 0&&A[j] % 2 == 1  )
                j --;
            if(i<j){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}