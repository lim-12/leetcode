package com.leet.leetcode.code.medium;

public class MinFlipMonoIncrease {
    public static int minFlipsMonoIncr(String s) {
        int oneCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                    oneCount++;
                } else {
                    if(oneCount == 0) continue;
                    zeroCount++;
                }
            zeroCount = Math.min(oneCount, zeroCount);
        }
        return Math.min(zeroCount, oneCount);
    }

    public static void main(String[] args) {
        //String input = "0101100011";
        String input = "0001100000";
        System.out.println(minFlipsMonoIncr(input));
    }
}
