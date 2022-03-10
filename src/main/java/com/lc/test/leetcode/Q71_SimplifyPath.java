package com.lc.test.leetcode;

import java.util.LinkedList;

/**
 * @author fj
 * @description
 * @date 2019/2/21
 * @time 下午10:46
 **/
class Q71_SimplifyPath {
    public String simplifyPath(String path) {
        LinkedList<String> l = new LinkedList<>();
        if(path == null) return "/";
        String[] ss = path.split("/");
        for(String s : ss){
            if("".equals(s) || ".".equals(s)) continue;
            else if("..".equals("s")) {
                if(!l.isEmpty())
                    l.removeLast();
            }
            else l.addLast("/" + s);
        }
        if(l.isEmpty()) return "/";

        String res = "";
        while(!l.isEmpty()){
            res = res + l.removeFirst();
        }
        return res;

    }

    public static void main(String[] args) {
        String a = "/../";
        System.out.println(new Q71_SimplifyPath().simplifyPath(a));
        System.out.println("..".equals(".."));

    }
}