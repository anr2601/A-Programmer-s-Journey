import java.util.*;

public class levelorder{
    TreeNode root;
    void printLevelOrder(){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
    }
}
