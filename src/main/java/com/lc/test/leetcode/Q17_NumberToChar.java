package com.lc.test.leetcode;

import java.util.*;

/**
 * @author fj
 * @description
 * @date 2018/11/10
 * @time 下午11:04
 **/
public class Q17_NumberToChar {
    public static void main(String[] args) {
        String phone = "23";
        System.out.println(new Solution17().letterCombinations(phone).toString());
    }
}

class Solution17 {

    Map<Character,List<String>> map = new HashMap<>();
    {
        map.put('2', Arrays.asList("a","b","c"));
        map.put('3',Arrays.asList("d","e","f"));
        map.put('4',Arrays.asList("g","h","i"));
        map.put('5',Arrays.asList("j","k","l"));
        map.put('6',Arrays.asList("m","n","o"));
        map.put('7',Arrays.asList("p","q","r","s"));
        map.put('8',Arrays.asList("t","u","v"));
        map.put('9',Arrays.asList("w","x","y","z"));
    }



    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<String>();
        }
        if(digits.length() == 1){
            return map.get(digits.charAt(0));
        }

        List<String> result = new ArrayList<>();
        for (String str : map.get(digits.charAt(0))) {
            for(String s: letterCombinations(digits.substring(1,digits.length()))){
                result.add(str + s);
            }
        }
        return result;
    }
}