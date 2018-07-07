package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipAndInvertImage {

    //Flipping an Image No.832
    public static void main(String[] args) {
        int A[][] = {{1,1,0},{1,0,1},{0,0,0}};
       // int[][] A = new int[20][20];
        List<Integer> eachReverse = new ArrayList<Integer>();
        List<Integer> eachImage = new ArrayList<Integer>();
        int[][] reverse = new int[A.length][A[0].length];
        int[][] image = new int[A.length][A[0].length];
        int[][] result = new int[A.length][];

        for (int i =0; i<A.length; i++) {
            int[] each = A[i];
            for (int j = each.length-1 ;j>=0;j--) {
                eachReverse.add(each[j]);


                reverse[i][j] = each[j];
            }
        }

        for (int i =0; i<A.length; i++) {
            List each2 = Arrays.asList(eachReverse);
            for (int j = 0; j < each2.size(); j++) {
                if (each2.get(j).equals(0)) {
                    eachImage.add(1);
                } else {
                    eachImage.add(0);
                }
                //      reverse[i][j] = eachImage[j];

//                for(int n = 0;n<eachImage.size();n++){
//                    d[i] = eachImage.get(i);

            }
//
//                result = image[];
//            }
//        }
//        System.out.println(result);
        }
    }
}
