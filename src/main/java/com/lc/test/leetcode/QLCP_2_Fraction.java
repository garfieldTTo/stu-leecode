package com.lc.test.leetcode;

/**
 * @author fj
 * @date 2019/10/29
 **/
public class QLCP_2_Fraction {

    public int[] fraction(int[] cont) {
        int[] result = new int[2];
        if (cont.length == 0) {
            return null;
        }
        if(cont.length == 1) {
            result[0] = cont[0];
            result[1] = 1;
            return result;
        }
        return fractionByStep(cont[0],cont,1,cont.length - 1);
    }

    public int[] fractionByStep(int a, int[] cont,int start,int end){
        int[] result = new int[2];
        if(start == end) {
            result[0] = a * cont[start] + 1;
            result[1] = cont[start];
            return result;
        }
        int[] tmp = fractionByStep(cont[start], cont,start + 1,end);
        result[0] = a * tmp[0]  + tmp[1];
        result[1] = tmp[0];
        return result;
    }

    public static void main(String[] args) {
        QLCP_2_Fraction qlcp_2_fraction = new QLCP_2_Fraction();
        int[] input = new int[]{2147483647};

        int[] fraction = qlcp_2_fraction.fraction(input);
        System.out.println(fraction);

    }
}
