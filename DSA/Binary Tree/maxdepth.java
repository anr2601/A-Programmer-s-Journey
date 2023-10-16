public class maxdepth{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(5);
        int x = maxdepth(root);
        System.out.println(x);
    }

    private static int maxdepth(TreeNode root){

        if(root==null) return 0;

        int lh = maxdepth(root.left);
        int rh = maxdepth(root.right);

        return 1+Math.max(lh,rh);
    }
}