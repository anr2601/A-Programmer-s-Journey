import java.util.*;

public class lca {
    public static void main(String args[]) {

        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5, new TreeNode(6), new TreeNode(7));

        TreeNode p = root.right.left;
        TreeNode q = root.right.right.right;

        TreeNode x = getpath(root, p, q);
        System.out.println(x.val);

    }

    public static TreeNode getpath(TreeNode root, TreeNode p, TreeNode q){
        
        if(root==null || root==p || root==q) return root;

        TreeNode left = getpath(root.left, p, q);
        TreeNode right = getpath(root.right, p, q);

        if(left==null) return right;
        else if(right==null) return left;

        else return root;

    }

}