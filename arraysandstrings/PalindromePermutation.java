package com.ctci.arraysandstrings;

public class PalindromePermutation {

    public static void main(String [] args){
        String s = "tact coa";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        int a[] = new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' ') {
                if (a[c - 'a'] == 1) {
                    a[c - 'a']--;
                } else {
                    a[c - 'a']++;
                }
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(a[i]==0){
                count++;
            }
        }
        if(count==26 || count==25){
            return true;
        }
        return false;
    }
}
