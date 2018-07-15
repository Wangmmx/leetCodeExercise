package com.company;

import java.util.ArrayList;
import java.util.List;

public class MaxIncreaseKeepingSkyline {

    //Judge Route Circle No.657
    public static void main(String[] args) {
//     int[][] grid
       int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
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
        //System.out.println(leftToRight);
        //System.out.println(topToBottom);
        int[][] newGrid = new int[grid.length][grid[0].length];
        for (int k=0;k<grid.length;k++) {
            for (int m =0;m<grid[0].length;m++) {
                int aa = Integer.parseInt(leftToRight.get(k).toString());
                int bb = Integer.parseInt(topToBottom.get(m).toString());
                int minValue = Math.min(aa,bb);
                newGrid[k][m] = minValue;
               // System.out.println(minValue);
            }
        }
        int oldSum = 0;
        for (int i =0; i<grid.length;i++) {
            for (int j =0; j<grid[0].length;j++) {
                oldSum += grid[i][j];
            }
        }
        int newSum = 0;
        for (int i =0; i<newGrid.length;i++) {
            for (int j =0; j<newGrid[0].length;j++) {
                newSum += newGrid[i][j];
            }
        }
        System.out.println(newSum-oldSum);
    }
}
