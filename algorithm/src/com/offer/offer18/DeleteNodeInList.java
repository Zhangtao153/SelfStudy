package com.offer.offer18;


/**
 * @author zth
 * @Date 2019-08-10 10:01
 */
class ListNode{
    int val;
    ListNode next;
    public ListNode(int value,ListNode nextNode) {
        val=value;
        next=nextNode;
    }
}

public class DeleteNodeInList {

    /**
     *
     * @param head 链表头指针
     * @param pToBeDeleted 待删除节点
     * @return 返回头指针，如果返回 void ,将无法删除头结点
     *
     */
    public ListNode deleteNode(ListNode head, ListNode pToBeDeleted) {
        if (null == head || null == pToBeDeleted){
            return head;
        }
        // 要删除的节点不是尾节点
        if (pToBeDeleted.next != null){
            // 待删除节点失去引用变为可回收对象
            pToBeDeleted.val = pToBeDeleted.next.val;
            pToBeDeleted.next = pToBeDeleted.next.next;
        }else if (pToBeDeleted == head){
            head = null;
            pToBeDeleted = null;
        }else {
            // 链表有多个节点，删除尾节点
            // 需要从链表的头开始，顺序遍历得到该节点的前序节点，完成删除。
            ListNode pNode = head;
            while (pNode.next != pToBeDeleted){
                pNode = pNode.next;
            }
            pNode.next = null;
            pToBeDeleted = null;
        }
        return head;
    }


    //=========测试代码==========
    void test(ListNode head,ListNode PToBeDelete) {
        System.out.println("============");
        System.out.print("The original list is: ");
        ListNode curr=head;
        if(curr!=null) {
            while(curr.next!=null) {
                System.out.print(curr.val+",");
                curr=curr.next;
            }
            System.out.println(curr.val);
        }else {
            System.out.println();
        }

        System.out.print("The node to be deleted is: ");
        if(PToBeDelete!=null)
            System.out.println(PToBeDelete.val);
        else
            System.out.println();
        System.out.print("The result list is: ");
        curr=deleteNode(head, PToBeDelete);
        if(curr != null) {
            while(curr.next!=null) {
                System.out.print(curr.val+",");
                curr=curr.next;
            }
            System.out.println(curr.val);
        }else {
            System.out.println();
        }
        System.out.println("============");
    }

    /**
     * 链表含多个结点，删除头结点
     */
    void test1(){
        ListNode p4=new ListNode(4, null);
        ListNode p3=new ListNode(3, p4);
        ListNode p2=new ListNode(2, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1, p1);
    }

    /**
     * 链表含多个结点，删除中间结点
     */
    void test2() {
        ListNode p4=new ListNode(4, null);
        ListNode p3=new ListNode(3, p4);
        ListNode p2=new ListNode(2, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1, p3);
    }

    /**
     * 链表含多个结点，删除尾结点
     */
    void test3(){
        ListNode p4=new ListNode(4, null);
        ListNode p3=new ListNode(3, p4);
        ListNode p2=new ListNode(2, p3);
        ListNode p1=new ListNode(1, p2);
        test(p1, p4);
    }

    /**
     * 链表含一个结点，删除结点
     */
    void test4() {
        ListNode p4=new ListNode(4, null);
        test(p4, p4);
    }

    /**
     * 链表为空
     */
    void test5() {
        test(null, null);
    }

    public static void main(String[] args) {
        DeleteNodeInList demo = new DeleteNodeInList();
        demo.test1();
        demo.test2();
        demo.test3();
        demo.test4();
        demo.test5();
    }

}
