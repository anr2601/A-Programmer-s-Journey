import java.util.*;

public class itpreorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(7));
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        List<Integer> preorder = preorder(root);

        for(int i=0;i<preorder.size();i++){
            System.out.print(preorder.get(i)+" ");
        }
    }

    private static List<Integer> preorder(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        

        if(root==null) return preorder;
        
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        int level = st.size();
        while (true) {
            level = st.size();
            for (int i = 0; i < level; i++) {
                root = st.pop();
                if (root.right != null)
                    st.push(root.right);
                if (root.left != null)
                    st.push(root.left);
                preorder.add(root.val);
            }
            if(st.isEmpty()){
                break;
            }

            
        }
        return preorder;
    }
}