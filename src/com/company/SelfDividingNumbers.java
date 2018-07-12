package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {

    //Judge Route Circle No.657
    public static void main(String[] args) {
//     int left, int right output: List<Integer>
        int left = 1;
        int right = 22;
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            List aa = new ArrayList<>();
            String[] each = ("" + i).split("");
            List<String> list = Arrays.asList(each);
            int finalI = i;
            list.forEach(s -> {
                if (Integer.valueOf(s)!= 0 && finalI%(Integer.valueOf(s)) ==0) {
                    aa.add(s);
                }
            });
            if (aa.size() == list.size()) {
                result.add(i);
            }
        }
       System.out.println(result);
    }
}
