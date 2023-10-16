import java.util.*;


public class preorder {
    private static List<Integer> answer = new ArrayList<>();

    private static void dfs(TreeNode root){

        if(root == null){
            return;
        }

        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    private static List<Integer> preordIntegers(TreeNode root){
        
        dfs(root);
        return answer;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        preordIntegers(root);
    }
}
