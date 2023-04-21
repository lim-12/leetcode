package com.leet.leetcode.code.medium;

/*
    Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    Description
    - 비내림차순으로 정렬된 정수 배열 nums가 주어진다.
    - 주어진 target을 배열에서 찾아서 시작과 끝 위치를 반환한다.

    Example
    입력: nums = [5,7,7,8,8,10], target = 8
    출력: [3,4]

    입력: nums = nums = [5,7,7,8,8,10], target = 6
    출력 [-1,-1]

    입력: nums = [], target = 0
    출력 : [-1,-1]

    Constraints
    - 0 <= nums.length <= 10^5
    - -10^9 <= nums[i] <= 10^9
    - nums는 비내림차순 배열이다.
    - -10^9 <= target <= 10^9
*/
public class SearchRange
{
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] > target) end = mid - 1;
            else if(nums[mid] == target) break;
            else start = mid + 1;
        }

        int resultStart = -1;
        int resultEnd = -1;
        for(int i = start; i <= end; i++) {
            if(nums[i] == target)
            {
                if(resultStart == -1) {
                    resultStart = i;
                }
                resultEnd = i;
            }
        }
        return new int[]{resultStart,resultEnd};
    }

    public static void main(String[] args) {
        int[] input = new int[]{5,7,7,8,8,10};
        searchRange(input, 7);
    }
}
