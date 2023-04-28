package com.leet.leetcode.code;

import com.leet.leetcode.code.dto.TreeNode;

/*
    LINK : https://leetcode.com/problems/path-sum/description/
* */
public class PathSum
{
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && targetSum - root.val == 0) return true;
        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
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
        System.out.println(hasPathSum(treeNode1, 3118));
    }
}
