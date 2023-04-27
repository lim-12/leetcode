package com.leet.leetcode.code;

import com.leet.leetcode.code.dto.ListNode;

import java.util.ArrayList;
import java.util.List;

/*
    Link : https://leetcode.com/problems/middle-of-the-linked-list/
    Description
    - head에 단일 연결 목록이 주어 지면 연결 목록의 중간 노드를 반환합니다.
    - 두 개의 중간 노드가 있는 경우 두 번째 중간 노드를 반환합니다.

    Example
    입력 : head = [1,2,3,4,5]
    출력 : [3,4,5]

    입력 : head = [1,2,3,4,5,6]
    출력 : [4,5,6]

    Constraints
    - 1 <= Node.val <= 100
*/
public class MiddleNode {
    public static ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        List<ListNode> indexList = new ArrayList<>();
        ListNode temp = head;
        while(temp.next != null){
            indexList.add(temp);
            temp = temp.next;
        }
        indexList.add(temp);
        if (indexList.size() % 2 == 0) {
            return indexList.get(indexList.size() / 2 + 1);
        } else {
            return indexList.get(indexList.size() / 2);
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node4.next = node5;
        node3.next = node4;
        node2.next = node3;
        node1.next = node2;

        middleNode(node1);
    }
}
