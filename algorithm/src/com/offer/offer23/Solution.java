package com.offer.offer23;

/**
 * @author zth
 * @Date 2019-08-12 23:36
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public static ListNode EntryNodeOfLoop(ListNode pHead){
        // 先判断是否含有环
        ListNode meetingNode = meetingNode(pHead);
        if (meetingNode == null){
            return null;
        }
        // 获得环的节点数
        int count = 1;
        ListNode tempNode = meetingNode;
        while (tempNode.next != meetingNode){
            tempNode = tempNode.next;
            count++;
        }
        // 从链表头移动环中节点数
        tempNode = pHead;
        for (int i = 0; i < count; i++) {
            tempNode = tempNode.next;
        }

        ListNode tempNode2 = pHead;

        // 两个指针同时移动，相遇的节点即为环的入口节点
        while (tempNode != tempNode2){
            tempNode = tempNode.next;
            tempNode2 = tempNode2.next;
        }
        return tempNode;
    }

    /**
     * 判断链表中是否有环
     * 一快一慢两个指针，如果相遇，说明含有环
     * @param head 链表的头指针
     * @return 返回环中的一个节点
     */
    private static ListNode meetingNode(ListNode head){
        if (null == head){
            return null;
        }
        ListNode pSlow = head;
        ListNode pFast = head.next;

        while (pFast != null){
            if (pSlow==pFast){
                return pFast;
            }
            pSlow = pSlow.next;
            pFast = pFast.next;
            if (null!=pFast){
                pFast = pFast.next;
            }
        }
        return null;
    }

    public static void main(String[] args){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;

        ListNode enter = EntryNodeOfLoop(node1);
        if (null == enter){
            System.out.println("nul.....");
        }else {
            System.out.println(enter.val);
        }
    }
}
