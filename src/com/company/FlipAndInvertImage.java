package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipAndInvertImage {

    //Flipping an Image No.832
    public static void main(String[] args) {
        int A[][] = {{1,1,0},{1,0,1},{0,0,0}};
       // int[][] A = new int[20][20];
        int n = A.length;
        int m = A[0].length;
        int temp;
        for (int i = 0; i<n; i++) {
            for (int j =0; j<m/2; j++) {
                temp = A[i][j];
                A[i][j] = A[i][m-j-1];
                A[i][m-j-1] = temp;
            }
        }
        for (int p =0; p<n; p++) {
            for (int k = 0; k < m; k++) {
                if (A[p][k] == 1) {
                    A[p][k] = 0;
                } else {
                    A[p][k] = 1;
                }
            }
        }
        System.out.println(A);
    }
}
