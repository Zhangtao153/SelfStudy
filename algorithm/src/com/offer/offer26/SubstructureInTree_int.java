package com.offer.offer26;

/**
 * @author zth
 * @Date 2019-08-13 10:38
 */
public class SubstructureInTree_int {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if (null!= root1 && null != root2){
            if (root1.val==root2.val){
                res = doesTree1HaveTree2(root1,root2);
            }
            if (!res){
                res = HasSubtree(root1.left,root2);
            }
            if (!res){
                res = HasSubtree(root1.right,root2);
            }
        }
        return res;
    }

    /**
     * 判断树中以 root1 为根节点 和 子结构的根节点相等时，是否包含子结构
     * @param root1 树中节点
     * @param root2 子结构中的节点
     * @return 包含返回 true,否则返回 false
     */
    private static boolean doesTree1HaveTree2(TreeNode root1,TreeNode root2 ){
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }

        return doesTree1HaveTree2(root1.left,root2.left) && doesTree1HaveTree2(root1.right,root2.right);

    }

    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        boolean res = HasSubtree(node1,node3);
        System.out.println(res);
    }
}
