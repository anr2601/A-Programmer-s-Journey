import java.util.*;

public class postorder {
    private static List<Integer> answer = new ArrayList<Integer>();

    private static void dfs(TreeNode root){
        if(root == null){
            return;
        }

        System.out.println(root.val);
        System.out.println();
        dfs(root.left);
        dfs(root.right);
    }

    private static List<Integer> postordIntegers(TreeNode root){
        dfs(root);
        return answer;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        postordIntegers(root);
    }
}
