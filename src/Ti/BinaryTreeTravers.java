package Ti;

import Ti.util.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeTravers {

    /**
     * 给定一个二叉树，返回它的 前序 遍历。
     * @param args
     */

    private List<Integer> tlist = new ArrayList<>();
    public static void main(String[] args) {
//        1,null,2,3

        TreeNode root = new TreeNode(1);
        TreeNode tn = null;
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        root.right = t2;
        t2.left = t3;
        List<Integer> list = new BinaryTreeTravers().preorderTraversal(root);
        list.forEach(item->{
            System.out.println(item);
        });

    }

    public List<Integer> preorderTraversal(TreeNode root) {

        Stack<TreeNode> treeStack = new Stack<>();
        treeStack.add(root);

        while (!treeStack.isEmpty()){

            TreeNode t = treeStack.pop();

            if (t == null){
                continue;
            }

            tlist.add(t.val);
            treeStack.add(t.right);
            treeStack.add(t.left);

        }

        return tlist;
    }

//    public List<Integer> preorderTraversal(TreeNode root) {
//        recursive(root);
//        return tlist;
//    }
//    public void recursive(TreeNode treeNode){
//
//        if (treeNode==null){
//            return;
//        }
//        tlist.add(treeNode.val);
//        recursive(treeNode.left);
//        recursive(treeNode.right);
//
//    }

}
