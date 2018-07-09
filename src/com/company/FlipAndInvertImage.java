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
        //1,2,3,4类似的int[]左右互换内容，不用遍历每个数，只需要到n/2即可
        for (int i = 0; i<n; i++) {
            for (int j =0; j<m/2; j++) {
                temp = A[i][j];
                A[i][j] = A[i][m-j-1];
                //以此为轴两边值互换
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
        //输出先前后调换再01互换后的结果
    }
}
