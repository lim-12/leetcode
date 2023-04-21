package com.leet.leetcode.code;

import java.util.HashMap;
import java.util.Map;

    /*
    Link : https://leetcode.com/problems/two-sum/
    Description    - 정수 배열 nums와 정수가 주어지면 두 숫자의 합에 해당하는 인덱스를 반환합니다.
    - 각 입력에 정확히 하나의 값이 있다고 가정하며, 동일한 요소를 두 번 사용할 수 없습니다.

    Example    입력: nums = [2,7,11,15], target = 9
    출력: [0,1]
    설명 : nums[0] + nums[1] == 9이므로 [0, 1]을 반환합니다.

    입력: nums = [3,2,4], target = 6
    출력 [1,2]

    입력: nums = [3,3], target = 6
    출력 : [0,1]

    Constraints
    - 2 <= nums.length <= 10^4
    - -10^9 <= nums[i] <= 10^9
    - -10^9 <= target <= 10^9
    */
public class TwoSum
{
    /*
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    if(target == (nums[i]+nums[j])) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[0];
    }
    */

    /*
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(target == (nums[i]+nums[j])) return new int[]{i, j};
            }        }
        return new int[0];
    }
    */

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> matchMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int match = target - nums[i];

            if(matchMap.containsKey(match)) {
                return new int[]{i, matchMap.get(match)};
            }
            else {
                matchMap.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int[] output = twoSum(input, 9);
        System.out.println(output[0] + " " + output[1]);
    }
}