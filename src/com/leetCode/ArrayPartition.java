package com.leetCode;

import java.util.Arrays;

public class ArrayPartition {
    //561. Array Partition I
    //n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
    public static void main(String[] args) {
//        public int[] arrayPairSum(int[] nums) {
        int[] nums = {1, 1, 2, 2};
        int sum = 0;
        int n = nums.length / 2;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        System.out.println(sum);
        //2n组数 n组中每组取最小值 加在一起sum 求最大sum
    }
}

