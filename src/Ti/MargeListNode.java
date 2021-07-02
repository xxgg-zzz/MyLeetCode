package Ti;

import util.ListNode;

import java.util.List;

public class MargeListNode {
    public static void main(String[] args) {
        ListNode l1 = ListNode.generateNode("1->2->4");
        ListNode l2 = ListNode.generateNode("1->3->4");
        ListNode result = new MargeListNode().mergeTwoLists(l1,l2);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(l1!=null && l2!=null){
            ListNode temp;
            if(l1.val<=l2.val){
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur.next = temp;
            cur = cur.next;
        }
        if(l1 == null){
            cur.next = l2;
        }
        if(l2 == null){
            cur.next = l1;
        }
        return head.next;
    }
}
