//package Ti;
//
//import util.ListNode;
//
//import java.util.Stack;
//
//public class CQueue {
//    /**
//     * 用两个栈实现一个队列。队列的声明如下，
//     * 请实现它的两个函数 appendTail 和 deleteHead ，
//     * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。
//     * (若队列中没有元素，deleteHead 操作返回 -1 )
//     */
//    Stack<Integer> appendStack;
//    Stack<Integer> delateStack;
//    public CQueue() {
//        appendStack = new Stack<>();
//        delateStack = new Stack<>();
//    }
//
//    public void appendTail(int value) {
//        appendStack.push(value);
//    }
//
//    public int deleteHead() {
//        if(appendStack.size()==0 && delateStack.size()==0){
//            return -1;
//        }
//        if(delateStack.size()!=0){
//            return delateStack.pop();
//        }
//        while (!appendStack.isEmpty()){
//            delateStack.push(appendStack.pop());
//        }
//        return delateStack.pop();
//    }
//    public ListNode deleteNode(ListNode head, int val) {
//        if(head==null){
//            return null;
//        }
//        if(head.val == val){
//            return head.next;
//        }
//        ListNode temp = head;
//        while(temp.next!=null){
//            if(temp.next.val == val){
//                return temp.next.next;
//            }
//            temp = temp.next;
//        }
//        throw
//    }
//
//    public static void main(String[] args) {
//
//
//
//    }
//}
