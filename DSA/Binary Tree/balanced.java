public class balanced{

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(4));
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(9);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(5);
        int x = balanced(root);
        if(x==-1) System.out.println("Tree is not balanced.");
        else System.out.println("Tree is balanced.");
    }

    private static int balanced(TreeNode root){

        if(root==null) return 0;
        int lh = balanced(root.left);
        int rh = balanced(root.right);
        if(lh==-1 || rh==-1) return -1;
        if(lh-rh>1) return -1;

        return 1+Math.max(lh,rh);
    }
}