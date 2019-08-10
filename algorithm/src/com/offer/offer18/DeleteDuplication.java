package com.offer.offer18;

/**
 * @author zth
 * @Date 2019-08-10 11:29
 * 删除链表中重复元素，返回头节点
 */
public class DeleteDuplication {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplication(ListNode pHead){
        // 链表为空或只有一个节点
        if (null== pHead || null == pHead.next){
            return pHead;
        }
        ListNode curNode = pHead;
        ListNode preNode = null;

        while (curNode != null){
            boolean needDel = false;
            if (curNode.next!=null && curNode.val == curNode.next.val){
                needDel = true;
            }
            if (!needDel){
                // 当前节点不重复
                 preNode = curNode;
                 curNode = curNode.next;
            }else {
                // 当前节点重复
                ListNode toBeDel = curNode;
                while (toBeDel != null && toBeDel.val==curNode.val){
                    toBeDel = toBeDel.next;
                }
                if (preNode == null){
                    // 删除的节点为头结点
                    pHead = toBeDel;
                }else {
                    preNode.next = toBeDel;
                }
                // 该节点也会出现重复
                curNode = toBeDel;
            }
        }
        return pHead;
    }

    //========测试代码======
    void test(ListNode pHead) {
        System.out.println("-----------");
        System.out.print("The original list is: ");
        ListNode curr=pHead;
        if(curr!=null) {
            while(curr.next!=null) {
                System.out.print(curr.val+",");
                curr=curr.next;
            }
            System.out.println(curr.val);
        }else {
            System.out.println();
        }
        pHead=deleteDuplication(pHead);
        System.out.print("The result list is: ");
        curr=pHead;
        if(curr!=null) {
            while(curr.next!=null) {
                System.out.print(curr.val+",");
                curr=curr.next;
            }
            System.out.println(curr.val);
        }else {
            System.out.println();
        }
        System.out.println("-----------");
    }


    /**
     * 重复结点位于链表头部
     */
    void test1() {
        ListNode p4=new ListNode(3, null);
        ListNode p3=new ListNode(2, p4);
        ListNode p2=new ListNode(1, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1);
    }

    /**
     * 重复结点位于链表尾部
     */
    void test2() {
        ListNode p4=new ListNode(3, null);
        ListNode p3=new ListNode(3, p4);
        ListNode p2=new ListNode(2, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1);
    }

    /**
     * 重复结点位于链表中部
     */
    void test3() {
        ListNode p4=new ListNode(3, null);
        ListNode p3=new ListNode(2, p4);
        ListNode p2=new ListNode(2, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1);
    }

    /**
     * 连续出现重复结点
     */
    void test4() {
        ListNode p6=new ListNode(3, null);
        ListNode p5=new ListNode(3, p6);
        ListNode p4=new ListNode(2, p5);
        ListNode p3=new ListNode(2, p4);
        ListNode p2=new ListNode(1, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1);
    }

    /**
     * 多个重复结点
     */
    void test5() {
        ListNode p6=new ListNode(3, null);
        ListNode p5=new ListNode(3, p6);
        ListNode p4=new ListNode(3, p5);
        ListNode p3=new ListNode(2, p4);
        ListNode p2=new ListNode(1, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1);
    }

    /**
     * 无重复结点
     */
    void test6() {
        ListNode p6=new ListNode(6, null);
        ListNode p5=new ListNode(5, p6);
        ListNode p4=new ListNode(4, p5);
        ListNode p3=new ListNode(3, p4);
        ListNode p2=new ListNode(2, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1);
    }

    /**
     * 单个结点
     */
    void test7() {
        ListNode p1=new ListNode(6, null);
        test(p1);
    }

    /**
     * null
     */
    void test8() {
        ListNode p1=null;
        test(p1);
    }

    public static void main(String[] args) {
        DeleteDuplication demo= new DeleteDuplication();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
        demo.test6();
        demo.test7();
        demo.test8();
    }
}
