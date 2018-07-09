
package com.company;

import java.util.Arrays;

public class Transpose {

    //Transpose Matrix  No.868
    public static void main(String[] args) {
//        int[][] A;
        int[][] A = {{1,2,3,4},{4,5,6,7}};
        int m = A.length;
        int n = A[0].length;
        int[][] B = new int[n][m];
        int temp;
        for (int i =0; i< m; i++) {
            for (int j =0; j< n; j++) {
                temp = A[i][j];
                B[j][i] = temp;
            }
        }
        for (int k =0; k< B.length; k++) {
            System.out.println(Arrays.toString(B[k]));
        }
        System.out.println(B);
        //输出行列变化后的新int[][] B
    }


}
