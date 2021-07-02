package Ti;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class SumOfTree {


    /**
     *
     给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
     * @param args
     */

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(0);
        treeNode.left = treeNode2;

        int r = new SumOfTree().sumNumbers(treeNode);
        System.out.println(r);

    }

    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> queue = new LinkedBlockingDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(treeNode.left==null && treeNode.right==null){
                sum+=treeNode.val;
                continue;
            }
            if(treeNode.left!=null && treeNode.right!=null){
                treeNode.left.val = treeNode.val*10+treeNode.left.val;
                treeNode.right.val = treeNode.val*10+treeNode.right.val;
                queue.add(treeNode.left);
                queue.add(treeNode.right);
                continue;
            }
            if (treeNode.left!=null){
                treeNode.left.val = treeNode.val*10+treeNode.left.val;
                queue.add(treeNode.left);
            }
            if (treeNode.right!=null){
                treeNode.right.val = treeNode.val*10+treeNode.right.val;
                queue.add(treeNode.right);
            }
        }

        return sum;


    }

}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }