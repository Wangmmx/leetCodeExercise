package com.company;

public class PeakIndexInMountainArray {

    //Flipping an Image No.832
    public static void main(String[] args) {
//        int[] A;
        int[] A = {0,1,0};
        int num =0;
        for (int i = 0; i < A.length; i++) {
            if ((i == 0) || (i + 1 == A.length)) {
                System.out.println("wrong i");
            } else {
                if ((A[i - 1] < A[i]) && (A[i] > A[i + 1])) {
                     num = i;
                }
            }
        }
        System.out.println(num);
    }


}
