package com.leetCode;

public class No_620 {
    public static void main(String[] args) {
        System.out.println(Solution.getSQL());
    }

    //Please write a SQL query to output movies with an odd numbered ID
    // and a description that is not 'boring'.
    // Order the result by rating.
    static class Solution {
        public static String getSQL() {
            return "select * from cinema where id%2 = 1 and description <>'boring' order by rating desc";
        }
    }

}
