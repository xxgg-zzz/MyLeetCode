package Ti;

import util.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelEach {

    public static void main(String[] args) {

//        [3,9,20,null,null,15,7],

        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        List<List<Integer>> result = new LevelEach().levelOrderBottom(treeNode);
        result.forEach(item->{
            System.out.println("---");
            item.forEach(System.out::println);
        });

    }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(root);
        List<Integer> l1 = new ArrayList<>();
        l1.add(root.val);
        result.add(l1);
        while (true){
            List<Integer> list = new ArrayList<>();
            while (!q1.isEmpty()){
                TreeNode temp = q1.poll();

                if(temp.left!=null){
                    q2.offer(temp.left);
                    list.add(temp.left.val);
                }
                if(temp.right!=null){
                    q2.offer(temp.right);
                    list.add(temp.right.val);
                }
            }
            if(q1.isEmpty()&&q2.isEmpty()){
                break;
            }
            result.add(list);
            Queue<TreeNode> tempQueue;
            tempQueue = q1;
            q1 = q2;
            q2 = tempQueue;

        }
        int i = 0;
        int j = result.size()-1;
        while (i<j){
            List<Integer> temp;
            temp=result.get(i);
            result.set(i,result.get(j));
            result.set(j,temp);
            i++;
            j--;
        }

        return result;
    }

}
