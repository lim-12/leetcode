package com.leet.leetcode.code;

/*
    Link : https://leetcode.com/problems/search-insert-position/
    Description
    - 개별 정수의 정렬된 배열과 대상 값이 주어지면 대상이 발견되는 인덱스를 반환합니다.
    - 그렇지 않을 경우 순서대로 삽입된 인덱스를 반환합니다.

    Example
    입력: nums = [1,3,5,6], target = 5
    출력: 2

    입력: nums = [1,3,5,6], target = 2
    출력: 1

    입력: nums = [1,3,5,6], target = 7
    출력: 4

    Constraints
    - 1 <= nums.length <= 10^4
    - -10^4 <= nums[i] <= 10^4
    - nums는 오름차순 으로 정렬된 개별값을 포함합니다.
    - -10^4 <= target <= 10^4
*/
public class SearchInsert
{
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target || nums[i] > target) return i;
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,3,5,6};
        System.out.println(searchInsert(input, 7));
    }
}
