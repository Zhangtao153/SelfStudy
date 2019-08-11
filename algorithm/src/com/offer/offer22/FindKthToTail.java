package com.offer.offer22;


import java.util.Stack;

/**
 * @author zth
 * @Date 2019-08-11 16:12
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindKthToTail {
    /**
     * 方法一：通过双指针完成
     * @return 参数不合法返回 null ,否则返回对应的 ListNode
     */
    public ListNode FindKthToTail0(ListNode head,int k) {
        if (null==head || k<=0){
            return null;
        }
        ListNode PAhead = head;
        for (int i = 1; i < k; i++) {
            PAhead = PAhead.next;
            if (PAhead == null){
                return null;
            }
        }
        ListNode PBehind = head;
        while (null != PAhead.next){
            PAhead = PAhead.next;
            PBehind = PBehind.next;
        }
        return PBehind;
    }

    /**
     * 用栈实现
     */
    public ListNode FindKthToTail1(ListNode head,int k) {
        if (null == head || k<=0){
            return null;
        }
        int len = 0;
        Stack<ListNode> nodeStack = new Stack<>();
        ListNode node = head;
        while (node != null){
            nodeStack.push(node);
            len++;
            node = node.next;
        }

        if (len<k){
            return null;
        }else {
            for (int i = 0; i < k; i++) {
                node = nodeStack.pop();
            }
        }
        return node;
    }

    //=====================测试代码=======================

    /*
     * null
     */
    void test1() {
        ListNode head=null;
        ListNode result=FindKthToTail1(head, 1);
        if(result==null)
            System.out.println("test1 passed!");
        else
            System.out.println("test1 failed!");
    }

    /*
     * k超出范围
     */
    void test2() {
        ListNode head=new ListNode(2);
        ListNode result=FindKthToTail1(head, 2);
        if(result==null)
            System.out.println("test2 passed!");
        else
            System.out.println("test2 failed!");
    }

    /*
     * 单个结点
     */
    void test3() {
        ListNode head=new ListNode(1);
        ListNode result=FindKthToTail1(head, 1);
        if(result.val==1)
            System.out.println("test3 passed!");
        else
            System.out.println("test3 failed!");
    }

    /*
     * 尾结点
     */
    void test4() {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode result=FindKthToTail1(node1, 1);
        if(result.val==4)
            System.out.println("test4 passed!");
        else
            System.out.println("test4 failed!");
    }

    /*
     * 中间结点
     */
    void test5() {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode result=FindKthToTail1(node1, 2);
        if(result.val==3)
            System.out.println("test5 passed!");
        else
            System.out.println("test5 failed!");
    }

    /*
     * 头结点
     */
    void test6() {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode result=FindKthToTail1(node1, 4);
        if(result.val==1)
            System.out.println("test6 passed!");
        else
            System.out.println("test6 failed!");
    }

    public static void main(String[] args) {
        FindKthToTail demo = new FindKthToTail();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
    }
}
