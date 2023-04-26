package com.leet.leetcode.code;

/*
    Link : https://leetcode.com/problems/palindrome-number/
    Description
    - 정수 x가 주어지고, 만약 x가 대칭수이면 true를 반환하고 그렇지 않으면 false를 반환합니다.

    Example
    입력: x = 121
    출력: true

    입력: x = -121
    출력 false

    입력: x = 10
    출력 : false

    Constraints
    - -2^31 <= x <= 2^31 - 1
*/
public class PalindromeNumber
{
    public static boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        for(int i = 0; i < strX.length() / 2; i++) {
            if (strX.charAt(i) != strX.charAt(strX.length() -1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
