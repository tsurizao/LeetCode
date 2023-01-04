import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Given the root of a binary tree, return the inorder traversal of its nodes' values.

public class BinaryTreeInorderTraversal {

    // Class defined by exercise, is required to properly access node fields
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        // Stack class/data structure -- Using to store values
        Stack<TreeNode> valuesStack = new Stack<>();

        // Creating new TreeNode object to traverse/iterate through
        TreeNode node = root;

        List<Integer> values = new ArrayList<>();
        while (!valuesStack.empty()) {
            System.out.println(valuesStack.peek().val);
            values.add(valuesStack.peek().val);
            valuesStack.pop();
        }
        return values;
    }
}
