package util;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public static ListNode generateNode(String s){

//        1->2->3->4->5->NULL
        ListNode head = new ListNode(0);
        String[] sary = s.split(",");
        ListNode cur = head;
        for (int i = 0; i < sary.length; i++) {
            String ss = sary[i].trim();
            if(ss.equals("null")||ss.equals("NULL")){
                cur.next = null;
            }else{
                ListNode t = new ListNode(Integer.parseInt(ss));
                cur.next = t;
            }
            cur = cur.next;
        }
        return head.next;

    }
}