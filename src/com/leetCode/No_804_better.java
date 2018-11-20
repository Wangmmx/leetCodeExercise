package com.leetCode;


import java.util.TreeSet;

//Unique Morse Code Words No.804
public class No_804_better {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new Solution().uniqueMorseRepresentations(words));
    }

    static class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            TreeSet<String> treeSet = new TreeSet<>();
            for(String word : words) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    sb.append(morse[word.charAt(i) - 'a']);
                }
                treeSet.add(sb.toString());
            }
            return treeSet.size();
        }
    }
}
