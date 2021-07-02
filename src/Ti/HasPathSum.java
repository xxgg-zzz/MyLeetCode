package Ti;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class HasPathSum {

    public static void main(String[] args) {

//        给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。




    }

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null){
            return false;
        }

        Queue<TreeNode> queue = new LinkedBlockingDeque<>();

        queue.add(root);

        while (queue.peek()!=null){
            TreeNode t = queue.poll();
            if(t.left!=null){
                t.left.val += t.val;
                queue.add(t.left);
            }
            if(t.right!=null){
                t.right.val+=t.val;
                queue.add(t.right);
            }

            if(t.left==null&&t.right==null&&t.val==sum){
                return true;
            }

        }
        return false;

    }
}
