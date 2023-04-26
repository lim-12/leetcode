package com.leet.leetcode.code.medium;

public class LongestPalindrome
{
    public static String longestPalindrome(String s) {
        if (s.length() == 1) return s;

        String result = "";
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j <= i; j++) {
                String temp = check(s.substring(j, s.length() - i + j));
                if(!"".equals(temp)) {
                    return temp;
                }
            }
        }
        return result;
    }

    public static String check(String s) {
        for(int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return "";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Result : " + longestPalindrome("aacabdkacaa"));
    }
}
