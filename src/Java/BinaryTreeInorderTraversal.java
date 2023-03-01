package Java;

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
        // Stack used to store current node being checked. Allows nodes to be stored
        // keeping track of the order in which nodes are being traversed
        Stack<TreeNode> valStack = new Stack<>();
        // For storing node values to be returned per Inorder Traversal
        List<Integer> values = new ArrayList<>();

        // Each node is added to a Stack (if it isn't null) then each node.left is traversed
        // If a node.left is found null, the value of node(root) is stored in an Arraylist
        // Then node(root) is set to node.right.  The stack pops the top off, since it is an
        // end point.  Process if repeated on node.right -- checks node.left != null etc etc
        while(root != null || !valStack.empty()){
            // Add to stack and set root to node.left, as long as node isn't null
            if(root != null){
                valStack.push(root);
                root = root.left;
            }
            // If node.left is null, set node to top of stack, add the value of node(root) to
            // arraylist, set node(root) to node.right, pop stack.
            if(root == null){
                root = valStack.peek();
                values.add(root.val);
                root = root.right;
                valStack.pop();
            }
        }
        return values;
    }
}
