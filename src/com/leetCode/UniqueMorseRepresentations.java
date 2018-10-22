package com.leetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueMorseRepresentations {

    //Unique Morse Code Words No.804
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        ArrayList<String> fr = new ArrayList<>();
        List<String> wordsList = Arrays.asList(words);
        wordsList.forEach(s -> {
            String[] letters = s.split("");
            List<String> letterList = Arrays.asList(letters);
            List<String> a = new ArrayList();
            letterList.forEach(letter -> {
                for (int i = 0; i < abc.length; i++) {
                    if (letter.equals(abc[i])) {
                        a.add(morse[i]);
                    }
                }
            });
            String str1 = "";
            for(int i=0;i<a.size();i++){
                str1 += a.get(i);
            }
            fr.add(str1);
        });
        ArrayList aaaaa = new ArrayList();
        String[] boss = fr.toArray(new String[fr.size()]);
        for (int j = 0; j < fr.size(); j++) {
            if (!aaaaa.contains(boss[j])) {
                aaaaa.add(boss[j]);
            }
        }
        System.out.println(fr);
        System.out.println(aaaaa);
        System.out.println(aaaaa.size());
        //输出不相同的单词组成的摩斯码个数
    }


}
