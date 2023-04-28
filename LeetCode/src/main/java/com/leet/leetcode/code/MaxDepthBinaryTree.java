package com.leet.leetcode.code;

import com.leet.leetcode.code.dto.TreeNode;

/*
    Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/
* */
public class MaxDepthBinaryTree
{
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println(maxDepth(treeNode1));
    }
}
