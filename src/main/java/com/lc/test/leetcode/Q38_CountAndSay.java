package com.lc.test.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fj
 * @description
 * @date 2019/2/7
 * @time 下午6:22
 **/
public class Q38_CountAndSay {
    public static void main(String[] args) {
        System.out.println(new Solution38().countAndSay(4));
    }
}


class Solution38 {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        return say(countAndSay(n-1));
    }

    public String say(String str){
        if(str == null || "".equals(str)) return "";

        List<CountData> list = new ArrayList<CountData>();
        CountData tmp  = new CountData();
        for(int i = 0; i < str.length(); i++){
            if(list.size() ==0 ) {
                tmp = new CountData();
                tmp.data = str.charAt(i);
                list.add(tmp);
            }else if(!list.get(list.size()-1).data.equals(str.charAt(i))){
                tmp = new CountData();
                tmp.data = str.charAt(i);
                list.add(tmp);
            }
            tmp.count ++;
        }

        String result = "";
        for(CountData c : list){
            result +=c.count;
            result +=c.data;
        }
        return result;

    }
}
class CountData{
    public int count = 0;

    public Character data;
}