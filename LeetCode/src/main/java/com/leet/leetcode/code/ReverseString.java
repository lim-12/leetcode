package com.leet.leetcode.code;

/*
    Link : https://leetcode.com/problems/reverse-string/

    Description
    - 문자열을 반전시키는 함수를 작성하십시오. 입력 문자열은 문자 배열로 제공됩니다.
    - 추가 메모리를 사용 하여 입력 배열을 제자리에서 수정하여 이를 수행해야 합니다.

    Example
    입력: s = ["h","e","l","l","o"]
    출력: ["o","l","l","e","h"]

    입력: s = ["H","a","n","n","a","h"]
    출력: ["h","a","n","n","a","H"]

    Constraints
    - 1 <= s.length <= 10^5
    - s[i]인쇄 가능한 ASCII 문자
* */
public class ReverseString {
    public static void reverseString(char[] s) {
        int right = s.length - 1;

        for(int left = 0; left < s.length/2; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

    public static void main(String[] args) {
        char[] input = {'h','e','l','l','o'};
        reverseString(input);
    }
}
