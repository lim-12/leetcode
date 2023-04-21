package com.leet.leetcode.code;

public class FirstBadVersion
{
    /*
    public static int firstBadVersion(int n) {
        for(int i = 1; i <= n; i++) {
            if(isBadVersion(i)) return i;
        }
        return 0;
    }
    */

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static boolean isBadVersion(int n) {
        return n >= 17;
    }

    public static void main(String[] args) {
        firstBadVersion(14);
    }
}
