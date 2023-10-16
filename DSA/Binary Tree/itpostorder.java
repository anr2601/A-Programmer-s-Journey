import java.util.*;

public class itpostorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.left.right = new TreeNode(7);
        root.right.left.right.right = new TreeNode(8);

        List<Integer> postorder = postorder(root);
        for(int i =0; i<postorder.size();i++){
            System.out.print(postorder.get(i)+" ");
        }
    }

    private static List<Integer> postorder(TreeNode root) {
        List<Integer> postorder = new ArrayList<Integer>();
        if (root == null)
            return postorder;

        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();

        st1.push(root);

        TreeNode node = root;

        while (!st1.isEmpty()) {
            node = st1.pop();
            st2.push(node);
            if (node.left != null)
                st1.push(node.left);
            if (node.right != null)
                st1.push(node.right);
        }

        while(!st2.isEmpty()){
            postorder.add(st2.pop().val);
        }
        return postorder;
    }
}