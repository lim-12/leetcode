package com.leet.leetcode.code.medium;

import java.util.LinkedHashMap;
import java.util.Map;

/*
    Link : https://leetcode.com/problems/lru-cache/
    Description
    - LRU(최소 사용) 캐시 의 제약 조건을 따르는 데이터 구조를 설계합니다.
    - 클래스를 구현합니다 LRUCache.
    - LRUCache(int capacity)양의 크기 로 LRU 캐시를 초기화합니다 capacity.
    - int get(int key)key키가 존재하면 의 값을 반환하고 그렇지 않으면 를 반환합니다 -1.
    - void put(int key, int value)key존재하는 경우 값을 업데이트합니다 key. 그렇지 않으면 key-value쌍을 캐시에 추가하십시오. 키 수가 capacity이 작업에서 초과하는 경우 가장 최근에 사용된 키를 제거합니다 .
    - 함수 get및 는 put각각 O(1)평균 시간 복잡성으로 실행되어야 합니다.

    Example
    입력
    - ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
    - [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
    출력
    - [null, null, null, 1, null, -1, null, -1, 3, 4]

    Constraints
    - 1 <= capacity <= 3000
    - 0 <= key <= 10^4
    - 0 <= value <= 10^5
    - 대부분 2 * 10^5번의 get, put 호출로 이루어집니다.
*/
public class LRUCache
{
    int capacity;
    Map<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>();
    }

    public int get(int key) {
        if(cache.containsKey(key)) {
            int tmp = cache.remove(key);
            cache.put(key, tmp);
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            cache.remove(key);
            cache.put(key, value);
        } else if(cache.size() < capacity) {
            cache.put(key, value);
        } else {
            if(cache.size() == capacity) {
                cache.remove(cache.entrySet().iterator().next().getKey());
                cache.put(key, value);
            }
        }
    }

    public static void main(String[] args) {

    }
}
