package com.offer.offer24;

/**
 * @author zth
 * @Date 2019-08-13 8:10
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseList {
    public static ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode PreNode =null;
        ListNode node = head;
        ListNode nextNode = head;

        while (nextNode!=null){
            node = nextNode;
            nextNode = nextNode.next;
            node.next = PreNode;
            PreNode = node;
        }
        return node;
    }

    public static void main(String[] args){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node1;
        node2.next=node3;
        node3.next=node4;

        ListNode node = ReverseList(node1);
        System.out.println(node.val);
    }

}
