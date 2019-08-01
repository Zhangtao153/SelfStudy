package com.offer.offer07;
import org.junit.Test;

/**
 * @author zth
 * @Date 2019-07-29 7:54
 */
public class Solution {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }


    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        // 验证前、中序列的合法性
        if (null == pre || null == in || pre.length<=0 || in.length<=0 || pre.length != in.length){
            return  null;
        }
        return constructCore(pre,in,0,pre.length-1,0,in.length-1);
    }

    public TreeNode constructCore(int [] pre,int [] in,int pStart,int pEnd,int iStart,int iEnd){
        TreeNode root  = new TreeNode(pre[pStart]);

        // 序列只有一个节点
        if (pStart == pEnd && iStart == iEnd){
            if (pre[pStart] != in[iStart]){
                try {
                    throw new Exception("前、中序列不匹配1");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return  root;
        }

        /**
         * 中序序列中找根节点
         */
        int index = iStart;
        while (root.val != in[index] && index<=iEnd){
            index++;
        }
        if (index>iEnd) try {
            throw new Exception("前、中序列不匹配2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int leftLength  = index-iStart;
        if (leftLength >0){
            root.left = constructCore(pre,in,pStart+1,pStart+leftLength,iStart,index-1);
        }
        if (leftLength < iEnd-iStart){
            root.right = constructCore(pre,in,pStart+leftLength+1,pEnd,index+1,iEnd);
        }
        return root;
    }

    /**
     * 前序遍历
     */
    private void preOrderTravel(TreeNode node){
        if (node == null){
            return;
        }
        System.out.print(node.val+"\t");
        preOrderTravel(node.left);
        preOrderTravel((node.right));
    }

    /**
     * 中序遍历
     */
    private void inOrderTravel(TreeNode node){
        if (node == null){
            return;
        }
        inOrderTravel(node.left);
        System.out.print(node.val+"\t");
        inOrderTravel(node.right);
    }

    /**
     * 正确的测试用用例
     */
    @Test
    public void test1(){
        int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
        int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
        TreeNode node = reConstructBinaryTree(pre,in);
        System.out.println("前序遍历：");
        preOrderTravel(node);
        System.out.println("中序遍历：");
        inOrderTravel(node);
    }
}
