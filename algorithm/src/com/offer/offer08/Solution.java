package com.offer.offer08;

import org.junit.Test;

/**
 * @author zth
 * @Date 2019-07-29 9:56
 */
public class Solution {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode == null){
            return null;
        }
        /**
         * 有右节点
         */
        if (pNode.right != null){
            pNode = pNode.right;
            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }
        /**
         * 没有右节点
         */
        while (pNode.next != null){
            // 该节点是父节点的左节点
            if (pNode.next.left == pNode){
                return pNode.next;
            }
            pNode = pNode.next;
        }

        return null;
    }

    @Test
    public void test1() {
        TreeLinkNode node = null;
        TreeLinkNode nextNode = GetNext(node);
        if(nextNode!=null)
            System.out.println(nextNode.val);
        else
            System.out.println("无下一结点");

        TreeLinkNode node1 = new TreeLinkNode(1);
        TreeLinkNode node2 = new TreeLinkNode(2);
        TreeLinkNode node3 = new TreeLinkNode(3);
        TreeLinkNode node4 = new TreeLinkNode(4);

        node1.left = node2;
        node2.next = node1;
        node1.right = node3;
        node3.next = node1;

        TreeLinkNode nextNode1 = GetNext(node1);
        if(nextNode1!=null)
            System.out.println(nextNode1.val);
        else
            System.out.println("无下一结点");
    }
}
