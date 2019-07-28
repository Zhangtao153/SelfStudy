package com.offer.offer06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author zth
 * @Date 2019-07-28 10:39
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Solution {

    public static  class ListNode{
        int val;
        ListNode next = null;
        public ListNode(int val){
            this.val = val;
        }
    }

    /**
     * 采用栈完成
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        while (listNode!=null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();

        while (!stack.empty()){
            list.add(stack.pop().val);
        }
        return list;
    }

    // 递归方式
    ArrayList<Integer> list = new ArrayList<>();
    public  ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {

        if (listNode != null){
            printListFromTailToHead1(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }


    public static void main(String[] args){
        // 节点为空
        ListNode listNode = null;
        System.out.println(new Solution().printListFromTailToHead1(listNode).toString());

        ListNode ListNode1 = new ListNode(1);
        ListNode ListNode2 = new ListNode(2);
        ListNode ListNode3 = new ListNode(3);
        ListNode ListNode4 = new ListNode(4);
        ListNode ListNode5 = new ListNode(5);
        ListNode1.next=ListNode2;
        ListNode2.next=ListNode3;
        ListNode3.next=ListNode4;
        ListNode4.next=ListNode5;
       // 多个节点
        System.out.println(new Solution().printListFromTailToHead1(ListNode1).toString());
    }

}
