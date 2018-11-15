package com.leetCode;

import java.util.Queue;
import java.util.Stack;

//921. Minimum Add to Make Parentheses Valid
public class No_921 {
    public static void main(String[] args) {
        System.out.println((new Solution().minAddToMakeValid("))))(()")));
    }

    static class Solution {
        public int minAddToMakeValid(String S) {
            int count = 0;
            int left = 0;
            char[] c = S.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '(') left++;
                else {
                    if ( left!=0 ) {
                        left--;
                    } else count++;
                }
            }
            return count + left;
        }
    }
}