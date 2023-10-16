import java.util.*;

public class roottonode {

    public static void main(String args[]){
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5, new TreeNode(6), new TreeNode(7));

        List<Integer> list = solve(root, 7);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }

    public static ArrayList<Integer> solve(TreeNode a, int b){

        ArrayList<Integer> arr = new ArrayList<>();
        if(a==null) return arr;
        getpath(a,arr,b);

        return arr;

    }
    private static boolean getpath(TreeNode root, ArrayList<Integer> arr, int x){

        if(root==null) return false;

        arr.add(root.val);
        if(root.val == x) return true;
        if(getpath(root.left, arr, x) || getpath(root.right, arr, x)) return true;

        arr.remove(arr.size()-1);
        return false;
    }
}
