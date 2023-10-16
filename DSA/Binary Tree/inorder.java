import java.util.*;

public class inorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        List<Integer> inorder = inorder(root);

        for(int i=0;i<inorder.size();i++){
            System.out.print(inorder.get(i)+" ");
        }
    }

    private static List<Integer> inorder(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;

        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } 
            else {
                if (st.isEmpty())
                    break;
                node = st.pop();
                inorder.add(node.val);
                node = node.right;
            }
        }

        return inorder;
    }

}