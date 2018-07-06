package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumJewelsInStones {

    //Jewels and Stones
    public static void main(String[] args) {
        //给定参数J,S
        String J = "aA";
        String S= "aAAbbbb";
        List<String> aaa = new ArrayList<>();
        String[] listS = S.split("");
        List<String> lists = Arrays.asList(listS);
        String[] listJ = J.split("");
        List<String> listj = Arrays.asList(listJ);
        lists.forEach(s -> {
            if (listj.contains(s)) {
                aaa.add(s);
            }
        });
        System.out.println(aaa.size());
        //输出在S中的且与J中字母相同的个数
    }
}
