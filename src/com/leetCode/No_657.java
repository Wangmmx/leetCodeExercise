package com.leetCode;

public class No_657 {

    //Judge Route Circle No.657
    public static void main(String[] args) {
//        String moves;
        String moves = "LLRRUDU";
        int origin = moves.length();
        if (origin%2 !=0){
            int r = origin - (moves.replaceAll("L", "").length());
            int l = origin - (moves.replaceAll("R", "").length());
            int u = origin - (moves.replaceAll("U", "").length());
            int d = origin - (moves.replaceAll("D", "").length());
            if ((r ==l) && (u ==d)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        //输出boolean值判断是否能回到原点 直接处理string
    }


}
