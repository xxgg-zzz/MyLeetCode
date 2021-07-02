package Ti;

import util.ListNode;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {

//        ListNode list = new Test().removeDuplicateNodes(ListNode.generateNode("1, 2, 3, 3, 2, 1"));
//        while(list!=null){
//            System.out.println(list.val);
//            list = list.next;
//        }
        ListNode root = new ListNode(1);
        ListNode l2 = new ListNode(2);
        root.next = l2;
        new Test().isPalindrome(root);


    }


    public boolean isPalindrome(ListNode head) {
        int count = 0;
        ListNode ctemp = head;
        while(ctemp!=null){
            count++;
            ctemp = ctemp.next;
        }
        int mid = count/2;
        count = 0;
        ListNode rtemp = head;
        while(count<=mid){
            count++;
            rtemp = rtemp.next;
        }
        if(count%2==1){
            rtemp = rtemp.next;
        }
        rtemp = reverseListNode(rtemp);
        while(rtemp!=null &&head!=null){
            if(rtemp.val!=head.val){
                return false;
            }
            rtemp = rtemp.next;
            head = head.next;
        }
        return true;

    }

    public ListNode reverseListNode(ListNode node){
        ListNode pre = null;
        ListNode cur = node;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
//    public ListNode removeDuplicateNodes(ListNode head) {
//        if(head == null){
//            return head;
//        }
//        ListNode pre = null;
//        ListNode cur = head;
//
//        while(cur!=null){
//            if(pre!=null && pre.val == cur.val){
//                pre.next = cur.next;
//                cur = cur.next;
//                continue;
//            }
//            pre = cur;
//            cur = cur.next;
//
//        }
//
//        return head;
//
//    }

}
