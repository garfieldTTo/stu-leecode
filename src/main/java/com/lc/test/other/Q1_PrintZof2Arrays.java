package com.lc.test.other;

/**
 * @author fj
 * @description
 * @date 2018/12/2
 * @time 下午11:05
 **/
public class Q1_PrintZof2Arrays {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        new Q1_PrintZof2Arrays().solution(arr);

    }


    private void solution(int[][] arr) {
        if (arr.length == 0) {
            return;
        }

        int times = arr.length + arr[0].length - 1;

        for (int i = 0; i < times; i++) {
            for (int j = 0; j <= i; j++) {
                int x = j;
                int y = i - j;
                if (y >= arr.length || x >= arr[0].length) {
                    continue;
                }
                System.out.println(arr[y][x]);
            }
        }
    }
}
