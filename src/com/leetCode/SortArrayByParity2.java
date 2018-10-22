package com.leetCode;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortArrayByParity2 {
    //922. Sort Array By Parity 2
    public static void main(String[] args) {
//        public int[] sortArrayByParity(int[] A) {
        int[] A = {3, 1, 2, 4};
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                odd.add(A[i]);
            } else {
                even.add(A[i]);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        for (int i = 0; i < A.length/2; i++) {
            A[2*i] = odd.get(i);
            A[2*i +1] = even.get(i);
        }
//        for (int i = 0; i < A.length; i++) {
//            System.out.print(A[i] + " ");
//        }
        System.out.println(A.toString());
        //根据数组输出数组 要求偶数位是偶数值 奇数位输出奇数值
    }
}

