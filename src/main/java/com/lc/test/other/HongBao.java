package com.lc.test.other;

import java.util.Random;

/**
 * @author fj
 * @description
 * @date 2019/3/12
 * @time 下午4:34
 **/
public class HongBao {

    static class RedPackage {
        int    remainSize = 10;
        double remainMoney = 200;
    }

    private static RedPackage redPackage = new RedPackage();



    static void init() {
        redPackage.remainSize  = 10;
        redPackage.remainMoney = 200;
    }

    public static double getRandomMoney(RedPackage _redPackage) {
        // remainSize 剩余的红包数量
        // remainMoney 剩余的钱
        if (_redPackage.remainSize == 1) {
            _redPackage.remainSize--;
            return (double) Math.round(_redPackage.remainMoney * 100) / 100;
        }
        Random r     = new Random();
        double min   = 0.01; //
        double max   = _redPackage.remainMoney / _redPackage.remainSize * 2;
        double money = r.nextDouble() * max;
        money = money <= min ? 0.01: money;
        money = Math.floor(money * 100) / 100;
        _redPackage.remainSize--;
        _redPackage.remainMoney -= money;
        return money;
    }

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < redPackage.remainSize; i++) {
            double tmp = getRandomMoney(redPackage);
            sum += tmp;
            System.out.println(tmp + "  ");
        }

        System.out.println("总和 = " + sum);
    }
}
