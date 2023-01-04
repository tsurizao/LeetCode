import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;}

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> valuesStack = new Stack<>();
        TreeNode node = root;
        while(node != null || !valuesStack.isEmpty()){
            if(node != null){
                valuesStack.push(node);
                node = node.left;
            }
            if(node == null){
                node = valuesStack.peek();
                valuesStack.pop();
                node = node.right;
            }
        }
        List<Integer> values = new ArrayList<>();
        while(!valuesStack.empty()){
            values.add(valuesStack.peek().val);
            valuesStack.pop();
        }
        return values;
    }
}
