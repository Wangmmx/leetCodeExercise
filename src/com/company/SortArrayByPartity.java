package com.company;

import java.util.Arrays;

/**
 * Created by lenovo on 2018/10/10.
 */
public class SortArrayByPartity {
    public static void main(String[] args) {
//        public int[] sortArrayByParity(int[] A) {
        int[] A = {3, 1, 2, 4};
        int[] result = new int[A.length];
        int m = 0;
        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                result[m++] = A[i];

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                result[m++] = A[i];
        System.out.println(result.toString());
    }
}

