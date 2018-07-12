package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {

    //Judge Route Circle No.657
    public static void main(String[] args) {
//     int left, int right output: List<Integer>
        int left = 22;
        int right = 22;
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String[] each = ("" + i).split("");
            List<String> list = Arrays.asList(each);
            System.out.println(list);
            int finalI =i;
            list.forEach(s -> {
                int num = Integer.valueOf(s);
                if (num!=0) {
                    if (finalI%num == 0) {
                        result.add(finalI);
                    }
                }
            });
//            int finalI = i;
//            list.forEach(number ->{
//                int num = Integer.valueOf(number);
//                while (num!=0) {
//                    if (finalI %num == 0) {
//                        result.add(Integer.valueOf(finalI));
//                    }
//                }
//            });
        }
        System.out.println(result);


    }
}
