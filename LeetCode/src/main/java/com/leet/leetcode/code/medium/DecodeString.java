package com.leet.leetcode.code.medium;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder res = new StringBuilder();
        StringBuilder numSb = new StringBuilder();

        int idx = 0;
        while (idx < s.length()) {
            char curLetter = s.charAt(idx);
            if (Character.isDigit(curLetter)) {
                numSb.append(curLetter);
                idx++;
            } else if (curLetter == '[') {
                numStack.push(Integer.parseInt(numSb.toString()));
                strStack.push(res.toString());
                numSb = new StringBuilder();
                res = new StringBuilder();
                idx++;
            } else if (curLetter == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeatTimes = numStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp;
                idx++;
            } else {
                res.append(s.charAt(idx++));
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}
