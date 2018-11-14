package com.leetCode;

import java.util.Stack;

//20. Valid Parentheses
public class No_20 {
    public static void main(String[] args) {
        System.out.println(Solution.isValid("{[]}"));
    }

    static class Solution {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{') stack.push(c);
                else {
                    if (stack.isEmpty()) return false;
                    char peek = stack.pop();
                    if (peek == '(' && c != ')') return false;
                    if (peek == '[' && c != ']') return false;
                    if (peek == '{' && c != '}') return false;
                }
            }
            if (!stack.isEmpty()) return false;
            return true;
        }
    }

}
