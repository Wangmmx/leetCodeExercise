package com.leetCode;


public class ReverseString {

    //344. Reverse String
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
        //字符串反转
    }
}
