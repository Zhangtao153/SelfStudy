package com.offer.offer25;

/**
 * @author zth
 * @Date 2019-08-13 8:57
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class MergeSortedLists {
    /**
     * 递归实现
     * @return 返回合并后的链表
     */
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }
        ListNode mergedList = null;

        if (list1.val < list2.val){
            mergedList = list1;
            mergedList.next = Merge(list1.next,list2);
        }else {
            mergedList = list2;
            mergedList.next = Merge(list1,list2.next);
        }

        return mergedList;
    }

    /**
     *非递归实现
     */
    public static ListNode Merge2(ListNode list1,ListNode list2){
        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }
        // 不能为 null
        ListNode pHead= new ListNode(0);
        ListNode mergedList = pHead;

        while (list1 != null && list2!= null){
            if (list1.val < list2.val){
                mergedList.next = list1;
                list1 = list1.next;
            }else {
                mergedList.next = list2;
                list2 = list2.next;
            }
            mergedList = mergedList.next;
        }

        if (list1 == null){
            mergedList.next = list2;
        }else {
            mergedList.next = list1;
        }

        return pHead.next;
    }

    public static void main(String[] args){
        ListNode list1Head =new ListNode(1);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(5);
        list1Head.next=node2;
        node2.next=node3;


        ListNode list2Head =new ListNode(2);
        ListNode node22=new ListNode(4);
        ListNode node23=new ListNode(6);
        list2Head.next=node22;
        node22.next=node23;

        ListNode mergedLIst = Merge2(list1Head,list2Head);
        while (null != mergedLIst){
            System.out.println(mergedLIst.val);
            mergedLIst = mergedLIst.next;
        }
    }
}
