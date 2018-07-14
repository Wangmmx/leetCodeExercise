package com.company;

import java.util.ArrayList;
import java.util.List;

public class MaxIncreaseKeepingSkyline {

    //Judge Route Circle No.657
    public static void main(String[] args) {
//     int[][] grid
       int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
       int num;
       List topToBottom = new ArrayList();
       List leftToRight = new ArrayList();
       int[][] grid2 = new int[grid[0].length][grid.length];
        for (int i=0;i<grid.length;i++) {
            int max = grid[0][0];
            int max2 = grid[0][0];
            for (int j=0;j<grid[0].length;j++) {
                grid2[i][j] = grid[j][i];
              if (max<grid[i][j]){
                  max = grid[i][j];
              }
              if (max2<grid2[i][j]) {
                  max2 = grid2[i][j];
              }
            }
            leftToRight.add(max);
            topToBottom.add(max2);
        }
        System.out.println(leftToRight);
        System.out.println(topToBottom);
        int[][] newGrid = new int[grid.length][grid[0].length];
        for (int k=0;k<grid.length;k++) {
            for (int m =0;m<grid[0].length;m++) {
                newGrid[k][m] = Integer.valueOf(leftToRight.get(k)>topToBottom.get(m)?leftToRight.get(k):topToBottom.get(m);
            }
        }



      // System.out.println();
    }
}
