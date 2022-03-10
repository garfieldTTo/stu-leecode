package com.lc.test.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fj
 * @description
 * @date 2019/2/17
 * @time 下午11:27
 **/
public class Q929_NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        if(emails == null || emails.length == 0){
            return 0;
        }
        Set<String> set = new HashSet<>();
        for(int i = 0;i < emails.length;i ++){
            set.add(getEmail(emails[i]));
        }

        return set.size();
    }

    public String getEmail(String s){
        String[] ss = s.split("@");
        String[] pt = ss[0].split("[+]");
        String[] ot = pt[0].split(".");
        String res = "";
        for(int i = 0;i< ot.length; i ++){
            res += ot[i];
        }
        res += "@"+ss[1];
        return res;
    }

    public static void main(String[] args) {
        String a = "j";
        String[] ss = a.split("0");
        System.out.println(ss);
    }
}
