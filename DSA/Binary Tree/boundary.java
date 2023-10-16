import java.util.*;

public class boundary {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1,new TreeNode(2),new TreeNode(7));
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.left.left.right.left = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.left = new TreeNode(10);
        root.right.right.left.right = new TreeNode(11);

        List<TreeNode> res = new ArrayList<TreeNode>();
        res.add(root);
        leftboundary(root, res);
        addLeaves(root, res);
        rightboundary(root,res);

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i).val+" ");
        }
    }

    static Boolean isLeaf(TreeNode node){
        return node.left==null && node.right==null;
    }

    static void leftboundary(TreeNode root, List<TreeNode> res){
        TreeNode node = root.left;
        while(node!=null){
            if(isLeaf(node) == false) res.add(node);
            if(node.left!=null) node = node.left;
            else node = node.right;
        }
    }

    static void addLeaves(TreeNode root, List<TreeNode> res){
        if(isLeaf(root)){
            res.add(root);
            return;
        }

        if(root.left!=null) addLeaves(root.left, res);
        if(root.right!=null) addLeaves(root.right, res);
    }

    static void rightboundary(TreeNode root, List<TreeNode> res){
        TreeNode node = root.right;
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(node!=null){
            if(!isLeaf(node)) st.add(node);
            if(node.right!=null) node = node.right;
            else node = node.left;
        }

        while(!st.isEmpty()) res.add(st.pop());
    }
}
