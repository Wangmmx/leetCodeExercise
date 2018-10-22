package com.leetCode;

public class HammingDistance {

    //Hamming Distance No.461
    public static void main(String[] args) {
//        int x;
//        int y;
        int x = 32323;
        int y = 4123;
        int num = 0;
        String xByte = Integer.toBinaryString(x);
        String yByte = Integer.toBinaryString(y);
        while (xByte.length() < yByte.length()) {
            xByte = "0"+ xByte;
        }
        while (xByte.length() > yByte.length()) {
            yByte = "0"+ yByte;
        }
        String[] xaa = xByte.split("");
        String[] yaa = yByte.split("");
        for (int i = 0; i< xaa.length;i++) {
            if (!xaa[i].equals(yaa[i])) {
                num++;
            }
        }
        System.out.println(xByte);
        System.out.println(yByte);
        System.out.println(num);
        //返回二进制数中对应位数不同的个数
    }
}
