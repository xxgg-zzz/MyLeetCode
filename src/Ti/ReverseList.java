package Ti;

import util.ListNode;

public class ReverseList {

    public static void main(String[] args) {
        String s = "1->2->3->4->5->NULL";
        ListNode head = ListNode.generateNode(s);
        ListNode result = new ReverseList().reverseList(head);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = null;
        ListNode pre = head;
        return backTrace(cur,pre);
    }

    private ListNode backTrace(ListNode cur, ListNode pre) {
        if(pre==null){
            return cur;
        }
        ListNode t = backTrace(pre,pre.next);
        pre.next = cur;

        return t;

    }

//    public ListNode reverseList(ListNode head) {
//        ListNode cur = null;
//        ListNode pre = head;
//        while (pre!=null){
//            ListNode temp = pre.next;
//            pre.next = cur;
//            cur = pre;
//            pre = temp;
//        }
//        return cur;
//    }
}
