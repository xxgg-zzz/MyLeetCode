package Ti;

import util.ListNode;

//两个倒序列表求和
public class SumOfTwoLinkedList_2 {

    public static void main(String[] args) {

        //list1--13962 ==> 2 6 9 3 1
        //list2--37421 ==> 1 2 4 7 3
        //      result ==> 3 8 3 1 5 ==> 51383
//        初始化
//        [1,8]
//[0]

//        ListNode l1h = new ListNode(-1);
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(6);
//        ListNode l4 = new ListNode(3);
//        ListNode l5 = new ListNode(1);
//        l1h.next = l1;
        l1.next=l2;
        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
//        ListNode l2h = new ListNode(-1);
        ListNode l6 = new ListNode(0);
//        ListNode l7 = new ListNode(2);
//        ListNode l8 = new ListNode(4);
//        ListNode l9 = new ListNode(7);
//        ListNode l0 = new ListNode(3);
//        l2h.next = l6;
//        l6.next=l7;
//        l7.next=l8;
//        l8.next=l9;
//        l9.next=l0;
        SumOfTwoLinkedList_2 soft = new SumOfTwoLinkedList_2();
        ListNode result = soft.addTwoNumbers(l1,l6);
        System.out.println(result.val);
        while( (result = result.next) !=null){
            System.out.println(result.val);
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int lowVal = 0;
        int i = l1.val + l2.val + carry;
        if(i>=10){
            carry = 1;
            lowVal = i % 10;
        }else{
            carry = 0;
            lowVal = i;
        }
        ListNode resultNode = new ListNode(lowVal);
        ListNode currentNode = resultNode;
        while(true){
            int t1 = 0;
            int t2 = 0;
            if(l1 == null){
                t1 = 0;
            }else{
                while ((l1 = l1.next) != null){
                    t1 = l1.val;
                    break;
                }
            }

            if(l2 == null){
                t2 = 0;
            }else{
                while ((l2 = l2.next) != null){
                    t2 = l2.val;
                    break;
                }
            }

            if(l1 == null && l2 == null){
                break;
            }

            i = t1 + t2 + carry;
            if(i>=10){
                carry = 1;
                lowVal = i % 10;
            }else{
                carry = 0;
                lowVal = i;
            }
            currentNode.next = new ListNode(lowVal);
            currentNode = currentNode.next;
        }
        if(carry!=0){
            currentNode.next = new ListNode(1);
        }
        return resultNode;

    }

}

