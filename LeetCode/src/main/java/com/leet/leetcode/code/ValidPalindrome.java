package com.leet.leetcode.code;

/*
    Link : https://leetcode.com/problems/valid-palindrome-ii/
    Description
    - 문자열 s가 주어지고, 만약 s가 문자 1개를 삭제한 후 대칭일 수 있으면 true를 반환합니다.

    Example
    입력: s = "aba"
    출력: true

    입력: s = "abca"
    출력 true

    입력: s = "abc"
    출력 : false

    Constraints
    - 1 <= s.length <= 10^5
    - s 는 영어 소문자로 구성되어있다.
*/
public class ValidPalindrome
{
    public static boolean validPalindrome(String s) {
        return check(s, 0, s.length() - 1, false);
    }

    private static boolean check(String s, int l, int r, boolean removed) {
        if (l > r) {
            return true;
        }

        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                if (removed) {
                    return false;
                }
                break;
            }
        }
        return check(s, l + 1, r, true) || check(s, l, r - 1, true);
    }

    public static void main(String[] args) {
        //System.out.println(validPalindrome("deeee"));
        //System.out.println(validPalindrome("deeed"));
        //System.out.println(validPalindrome("deedee"));
        System.out.println(validPalindrome("ebcbbececabbacecbbcbe"));
    }
}
