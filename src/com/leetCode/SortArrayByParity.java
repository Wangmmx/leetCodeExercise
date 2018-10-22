package com.leetCode;


public class SortArrayByParity {
    //905. Sort Array By Parity
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

//       for (int i = 0; i < result.length; i++) {
//           System.out.print(result[i]+" ");
//       }
        System.out.println(result.toString());
        //根据数组输出数组 要求偶数在前半部分 奇数在后半部分
    }
}

