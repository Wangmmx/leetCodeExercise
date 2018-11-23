package com.leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class No_350 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,3,1};
        int[] nums2 = {3,3};
        int[] res = new No_349.Solution().intersection(nums1,nums2);
        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
    }

    static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int num : nums1) {
                if (!map.containsKey(num)) {
                    map.put(num, 1);
                } else {
                    map.put(num, map.get(num) + 1);
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int num : nums2) {
                if (map.containsKey(num)) {
                    list.add(num);
                    map.put(num, map.get(num) -1);
                    if (map.get(num) == 0) {
                        map.remove(num);
                    }
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
