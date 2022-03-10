package com.lc.test.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fj
 * @description
 * @date 2019/2/24
 * @time 下午8:53
 **/
class Q567_CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {

        if(s1 == null || s1.length() == 0) return true;
        else{
            if(s2 == null || s2.length() == 0) return false;
        }
        Map<Character,Integer> tMap = getTemValue(s1,0,s1.length()-1);

        int i = 0,j = s1.length() - 1;
        while(j < s2.length()){
            Map<Character,Integer> tmp = getTemValue(s2,i,j);
            if(areEqualsMap(tMap,tmp)) return true;
            i++;
            j++;
        }
        return false;
    }

    public Map<Character,Integer> getTemValue(String s,int low, int high){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        if(s == null || low > high) return map;
        for(int i = low;i <= high; i ++){
            char c = s.charAt(i);
            if(map.get(s.charAt(i)) == null) map.put(c,1);
            else{
                map.put(c,map.get(c)+1);
            }
        }
        return map;

    }

    public boolean areEqualsMap(Map<Character,Integer> m1,Map<Character,Integer> m2){
        for(Map.Entry<Character,Integer> entry: m1.entrySet()){
            if(m2.get(entry.getKey()) != entry.getValue()) return false;
        }
        return true;
    }


}