package com.leetcode.recursive;

/**
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 *
 * 示例 1:
 *
 * 输入:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * 输出:
 *
 * 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-univalue-path
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

public class Solution001 {
    int res;
    public int longestUnivaluePath(TreeNode root) {
        res = 0;
        arrowLength(root);
        return res;
    }

    public int arrowLength(TreeNode node){
        if (null == node) return 0;

        int left = arrowLength(node.left);
        int right = arrowLength(node.right);

        int arrowLeft = 0,arrowRight = 0;
        if (node.left != null && node.left.val == node.val){
            arrowLeft += left+1;
        }
        if (node.right != null && node.right.val == node.val){
            arrowRight +=left+1;
        }

        res = Math.max(res,arrowLeft+arrowRight);
        return Math.max(arrowLeft,arrowRight);
    }

}
