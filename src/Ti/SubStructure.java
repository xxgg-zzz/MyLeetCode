//package Ti;
//
//public class SubStructure {
//
//    public static void main(String[] args) {
//        //[10,12,6,8,3,11]
//        //[10,12,6,8]
//        TreeNode a = new TreeNode(10);
//        TreeNode b = new TreeNode(12);
//        TreeNode c = new TreeNode(6);
//        TreeNode d = new TreeNode(8);
//        TreeNode e = new TreeNode(3);
//        TreeNode f = new TreeNode(11);
//
//        TreeNode g = new TreeNode(10);
//        TreeNode h = new TreeNode(12);
//        TreeNode i = new TreeNode(6);
//        TreeNode j = new TreeNode(8);
//        a.left = b;
//        a.right = c;
//        b.left = d;
//        b.right = e;
//        c.left = f;
//        c.right = g;
//
//        g.left = h;
//        g.right = i;
//        h.left = j;
//        boolean result = new SubStructure().isSubStructure(a,g);
//        System.out.println(result);
//
//    }
//
//    StringBuffer sb = new StringBuffer();
//    public boolean isSymmetric(TreeNode root) {
//        midTraverse(root);
//        return sb.toString().equals(sb.reverse().toString);
//    }
//
//    public void midTraverse(TreeNode t){
//        if(t == null){
//            return;
//        }
//        midTraverse(t.left);
//        sb.append(t.val);
//        midTraverse(t.right);
//    }
//
//        StringBuffer sb = new StringBuffer();
//
//        public boolean isSubStructure(TreeNode A, TreeNode B) {
//            sb.toString().equals(sb.reverse().toString());
//            preTreverse(A);
//            String astr = sb.toString();
//            sb = new StringBuffer();
//            preTreverse(B);
//            String bstr = sb.toString();
//            if(A==null || B ==null){
//                return false;
//            }
//            return astr.contains(bstr);
//        }
//
//        private void preTreverse(TreeNode a) {
//            if(a == null){
//                return;
//            }
//            sb.append(a.val);
//            preTreverse(a.left);
//            preTreverse(a.right);
//        }
//
//
//}
