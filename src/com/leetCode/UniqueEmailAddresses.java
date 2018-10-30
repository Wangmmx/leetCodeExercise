package com.leetCode;


import java.util.HashSet;

public class UniqueEmailAddresses {
    //929. Unique Email Addresses
    public static void main(String[] args) {
//        public int numUniqueEmails(String[] emails) {
        String[] mails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        HashSet<String> uniqueSet = new HashSet<>();
        for (int i = 0; i <mails.length; i++) {
            String localName = mails[i].substring(0, mails[i].indexOf("+")).replace(".","");
            String domainName = mails[i].substring(mails[i].indexOf("@"));
            uniqueSet.add(localName+domainName);
        }
        //System.out.println(uniqueSet);
        System.out.println(uniqueSet.size());
    }
}

