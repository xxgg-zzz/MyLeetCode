package Ti;

import util.ListNode;

public class SwapPair {
    /**
     *给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
     你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     */
    public static void main(String[] args) {

        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode root = new ListNode(1);

        root.next = n2;
        n2.next = n3;
        n3.next = n4;
        new SwapPair().swapPairs(root);

        ListNode temp = root;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }

    public ListNode swapPairs(ListNode head) {
        ListNode t = head;
        while (t !=null){
            ListNode t2 = t.next;
            if(t2!=null){
                ListNode t3;
                t3 = t2;
                t2 = t;
                t = t3;
            }else {
                return head;
            }
            t = t2.next;
        }
        return head;
    }
}
