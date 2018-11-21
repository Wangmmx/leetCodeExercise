package com.leetCode;


import java.util.ArrayList;
import java.util.TreeSet;

public class No_349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,2,3};
        int[] nums2 = {1,3};
        int[] res = new Solution().intersection(nums1,nums2);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
    }

    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for(int num : nums1) {
                treeSet.add(num);
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int num : nums2) {
                if (treeSet.contains(num)) {
                    list.add(num);
                    treeSet.remove(num);
                }
            }
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }
    }
}
