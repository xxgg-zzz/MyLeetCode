package Ti;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {


    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();

        pQueue.add(p);
        qQueue.add(q);

        while (!pQueue.isEmpty()&&!qQueue.isEmpty()){

            if(pQueue.peek().val!=qQueue.peek().val){
                return false;
            }

            TreeNode pNode = pQueue.poll();
            TreeNode qNode = qQueue.poll();

            if(pNode.left!=null&&qNode.left==null
                    || pNode.right==null && qNode.right!=null
                    || pNode.left==null && qNode.left!=null
                    || pNode.right!=null && qNode.right==null
                    ){
                return false;
            }
            if(pNode.left!=null){
                pQueue.add(pNode.left);
            }
            if(pNode.right!=null){
                pQueue.add(pNode.right);
            }
            if(qNode.left!=null){
                qQueue.add(qNode.left);
            }
            if(qNode.right!=null){
                qQueue.add(qNode.right);
            }
        }


        if(pQueue.isEmpty()&&!qQueue.isEmpty() || !pQueue.isEmpty() && qQueue.isEmpty()){
            return false;
        }

        return true;
    }

}
